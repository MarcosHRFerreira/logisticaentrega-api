package br.com.fiap.tc.logisticaentrega_api.domain.output;

import br.com.fiap.tc.logisticaentrega_api.domain.enums.StatusEntregaEnum;

import java.time.LocalDateTime;

public record LogisticaEntregaResponse(

        Long entregaId,
        Long pedidoId,
        LocalDateTime dataenvio,
        LocalDateTime dataentregaestimanda,
        StatusEntregaEnum statusentrega,
        String transportadora

) {
}
