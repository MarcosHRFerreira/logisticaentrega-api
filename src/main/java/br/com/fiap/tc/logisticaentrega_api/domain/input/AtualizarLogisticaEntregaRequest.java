package br.com.fiap.tc.logisticaentrega_api.domain.input;

import br.com.fiap.tc.logisticaentrega_api.domain.enums.StatusEntregaEnum;

import java.time.LocalDateTime;

public record AtualizarLogisticaEntregaRequest(
        Long entregaId,
        Long pedidoId,
        LocalDateTime dataenvio,
        LocalDateTime dataentregaestimanda,
        StatusEntregaEnum statusentrega,
        String transportadora
) {
}
