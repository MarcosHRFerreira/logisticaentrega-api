package br.com.fiap.tc.logisticaentrega_api.domain.gateway;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.GestaoPedido;

public interface ConsultaGestaoPedidoPorIdInterface {

    /**
     * @param id
     * @return
     */

    GestaoPedido consultaPorId(final Long id);


}
