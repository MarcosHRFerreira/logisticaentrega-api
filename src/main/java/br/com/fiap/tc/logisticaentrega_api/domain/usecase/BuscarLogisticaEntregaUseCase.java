package br.com.fiap.tc.logisticaentrega_api.domain.usecase;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.BuscarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.infra.feign.LogisticaEntregaNaoEncontradaException;

public class BuscarLogisticaEntregaUseCase  {

    private final BuscarLogisticaEntregaInterface buscarLogisticaEntregaInterface;

    public BuscarLogisticaEntregaUseCase(BuscarLogisticaEntregaInterface buscarLogisticaEntregaInterface) {
        this.buscarLogisticaEntregaInterface = buscarLogisticaEntregaInterface;
    }

    public LogisticaEntrega buscarLogisticaEntregaPorId(Long id){

        LogisticaEntrega logisticaEntrega = buscarLogisticaEntregaInterface.buscarLogisticaEntregaPorId(id);

        if(logisticaEntrega==null){
            throw new LogisticaEntregaNaoEncontradaException("Entrega de id: " + id + " não foi encontrada");
        }
        return logisticaEntrega;
    }
}
