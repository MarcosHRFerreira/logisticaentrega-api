package br.com.fiap.tc.logisticaentrega_api.domain.gateway;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;

public interface BuscarLogisticaEntregaInterface {

    LogisticaEntrega buscarLogisticaEntregaPorId(Long id);

}
