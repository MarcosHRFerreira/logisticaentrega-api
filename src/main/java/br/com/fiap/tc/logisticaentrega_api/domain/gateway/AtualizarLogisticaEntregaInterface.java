package br.com.fiap.tc.logisticaentrega_api.domain.gateway;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;

public interface AtualizarLogisticaEntregaInterface {

    LogisticaEntrega atualizarLogisticaEntrega(Long id,LogisticaEntrega logisticaEntrega);

}
