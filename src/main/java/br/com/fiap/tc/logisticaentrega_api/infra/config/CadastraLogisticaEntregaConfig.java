package br.com.fiap.tc.logisticaentrega_api.infra.config;

import br.com.fiap.tc.logisticaentrega_api.domain.gateway.CadastrarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.ConsultaGestaoPedidoPorIdInterface;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.CadastrarLogisticaEntregaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadastraLogisticaEntregaConfig  {

    /**
     * @param cadastrarLogisticaEntregaInterface
     * @param consultaGestaoPedidoPorIdInterface
     * @return
     */

    @Bean
    public CadastrarLogisticaEntregaUseCase cadastrarLogisticaEntregaUseCase (CadastrarLogisticaEntregaInterface cadastrarLogisticaEntregaInterface,
                                                                              ConsultaGestaoPedidoPorIdInterface consultaGestaoPedidoPorIdInterface
                                                                              ){
        return  new CadastrarLogisticaEntregaUseCase(cadastrarLogisticaEntregaInterface,consultaGestaoPedidoPorIdInterface);
    }

}
