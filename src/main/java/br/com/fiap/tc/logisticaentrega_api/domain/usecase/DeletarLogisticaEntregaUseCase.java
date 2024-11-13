package br.com.fiap.tc.logisticaentrega_api.domain.usecase;

import br.com.fiap.tc.logisticaentrega_api.domain.gateway.DeletarLogisticaEntregaInterface;

public class DeletarLogisticaEntregaUseCase {

    private final DeletarLogisticaEntregaInterface deletarLogisticaEntregaInterface;
    private final BuscarLogisticaEntregaUseCase buscarLogisticaEntregaUseCase;


    public DeletarLogisticaEntregaUseCase(DeletarLogisticaEntregaInterface deletarLogisticaEntregaInterface, BuscarLogisticaEntregaUseCase buscarLogisticaEntregaUseCase) {
        this.deletarLogisticaEntregaInterface = deletarLogisticaEntregaInterface;
        this.buscarLogisticaEntregaUseCase = buscarLogisticaEntregaUseCase;
    }

    public boolean deletarLogisticaEntrega(Long id){

        buscarLogisticaEntregaUseCase.buscarLogisticaEntregaPorId(id);

        return  deletarLogisticaEntregaInterface.deletarLogisticaEntrega(id);

    }


}
