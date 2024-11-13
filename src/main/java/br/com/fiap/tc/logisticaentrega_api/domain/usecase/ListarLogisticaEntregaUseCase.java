package br.com.fiap.tc.logisticaentrega_api.domain.usecase;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.ListarLogisticaEntregaInterface;

import java.util.List;

public class ListarLogisticaEntregaUseCase {

    private final ListarLogisticaEntregaInterface listarLogisticaEntregaInterface;


    public ListarLogisticaEntregaUseCase(ListarLogisticaEntregaInterface listarLogisticaEntregaInterface) {
        this.listarLogisticaEntregaInterface = listarLogisticaEntregaInterface;
    }

    public List<LogisticaEntrega> listarLogisticaEntregas(){
        return listarLogisticaEntregaInterface.listarLogisticaEntregas();
    }

}
