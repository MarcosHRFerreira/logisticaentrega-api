package br.com.fiap.tc.logisticaentrega_api.infra.adapter.out;


import br.com.fiap.tc.logisticaentrega_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.ConsultaGestaoPedidoPorIdInterface;
import br.com.fiap.tc.logisticaentrega_api.domain.mapper.GestaoPedidoDtoMapper;
import br.com.fiap.tc.logisticaentrega_api.infra.feign.ConsultarGestaoPedidoPorID;
import br.com.fiap.tc.logisticaentrega_api.infra.feign.GestaoPedidoConexaoNaoEncontrada;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ConsultarGestaoPedidoPorIDAdapter implements ConsultaGestaoPedidoPorIdInterface {

    @Value("${application.client.host}")
    String clientHost;


    private final ConsultarGestaoPedidoPorID consultarGestaoPedidoPorID;
    private final GestaoPedidoDtoMapper gestaoPedidoDtoMapper;

    @Override
    public GestaoPedido consultaPorId(Long id) {
        try {

            return gestaoPedidoDtoMapper.toGestaoPedido(consultarGestaoPedidoPorID.consultaGestaoPedidoPorID(id));

        } catch (feign.RetryableException e) {
            throw new GestaoPedidoConexaoNaoEncontrada("Erro de conexão: não foi possível acessar o serviço de gestaopedido. " + clientHost );
        }
    }

}
