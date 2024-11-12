package br.com.fiap.tc.logisticaentrega_api.domain.usecase;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.enums.StatusEntregaEnum;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.CadastrarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.ConsultaGestaoPedidoPorIdInterface;

public class CadastrarLogisticaEntregaUseCase {

    private final CadastrarLogisticaEntregaInterface cadastrarLogisticaEntregaInterface;
    private final ConsultaGestaoPedidoPorIdInterface consultaGestaoPedidoPorIdInterface;

    public CadastrarLogisticaEntregaUseCase(CadastrarLogisticaEntregaInterface cadastrarLogisticaEntregaInterface, ConsultaGestaoPedidoPorIdInterface consultaGestaoPedidoPorIdInterface) {
        this.cadastrarLogisticaEntregaInterface = cadastrarLogisticaEntregaInterface;
        this.consultaGestaoPedidoPorIdInterface = consultaGestaoPedidoPorIdInterface;
    }

    public LogisticaEntrega cadastraLogisticaEntrega(LogisticaEntrega logisticaEntrega){


        consultaGestaoPedidoPorIdInterface.consultaPorId(logisticaEntrega.getPedidoId());

        logisticaEntrega.setStatusentrega(StatusEntregaEnum.AGUARDANDO);

        return cadastrarLogisticaEntregaInterface.cadastraLogisticaEntrega(logisticaEntrega);


    }


}
