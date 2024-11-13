package br.com.fiap.tc.logisticaentrega_api.domain.usecase;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.AtualizarLogisticaEntregaInterface;

public class AtualizarLogisticaEntregaUseCase {

    private final AtualizarLogisticaEntregaInterface atualizarLogisticaEntregaInterface;
    private final BuscarLogisticaEntregaUseCase buscarLogisticaEntregaUseCase;


    public AtualizarLogisticaEntregaUseCase(AtualizarLogisticaEntregaInterface atualizarLogisticaEntregaInterface, BuscarLogisticaEntregaUseCase buscarLogisticaEntregaUseCase) {
        this.atualizarLogisticaEntregaInterface = atualizarLogisticaEntregaInterface;
        this.buscarLogisticaEntregaUseCase = buscarLogisticaEntregaUseCase;
    }

    public LogisticaEntrega atualizarLogisticaEntrega(Long id, LogisticaEntrega logisticaEntrega){

        LogisticaEntrega entregaBuscada = buscarLogisticaEntregaUseCase.buscarLogisticaEntregaPorId(id);

        entregaBuscada.setStatusentrega(logisticaEntrega.getStatusentrega());
        entregaBuscada.setDataenvio(logisticaEntrega.getDataenvio());
        entregaBuscada.setDataentregaestimanda(logisticaEntrega.getDataentregaestimanda());
        entregaBuscada.setTransportadora(logisticaEntrega.getTransportadora());

        return atualizarLogisticaEntregaInterface.atualizarLogisticaEntrega(id,entregaBuscada);

    }

}
