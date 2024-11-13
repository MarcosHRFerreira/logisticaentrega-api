package br.com.fiap.tc.logisticaentrega_api.domain.gateway;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;

import java.util.List;

public interface ListarLogisticaEntregaInterface {
    List<LogisticaEntrega> listarLogisticaEntregas();
}
