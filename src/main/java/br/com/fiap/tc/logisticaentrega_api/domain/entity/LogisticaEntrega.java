package br.com.fiap.tc.logisticaentrega_api.domain.entity;

import br.com.fiap.tc.logisticaentrega_api.domain.enums.StatusEntregaEnum;

import java.time.LocalDateTime;

public class LogisticaEntrega {

    private Long entregaId;
    private Long pedidoId;
    private LocalDateTime dataenvio;
    private LocalDateTime dataentregaestimanda;
    private StatusEntregaEnum statusentrega;
    private String transportadora;

    public LogisticaEntrega(Long entregaId, Long pedidoId, LocalDateTime dataenvio, LocalDateTime dataentregaestimanda, StatusEntregaEnum statusentrega, String transportadora) {
        this.entregaId = entregaId;
        this.pedidoId = pedidoId;
        this.dataenvio = dataenvio;
        this.dataentregaestimanda = dataentregaestimanda;
        this.statusentrega = statusentrega;
        this.transportadora = transportadora;
    }

    public LogisticaEntrega() {
    }

    public Long getEntregaId() {
        return entregaId;
    }

    public void setEntregaId(Long entregaId) {
        this.entregaId = entregaId;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public LocalDateTime getDataenvio() {
        return dataenvio;
    }

    public void setDataenvio(LocalDateTime dataenvio) {
        this.dataenvio = dataenvio;
    }

    public LocalDateTime getDataentregaestimanda() {
        return dataentregaestimanda;
    }

    public void setDataentregaestimanda(LocalDateTime dataentregaestimanda) {
        this.dataentregaestimanda = dataentregaestimanda;
    }

    public StatusEntregaEnum getStatusentrega() {
        return statusentrega;
    }

    public void setStatusentrega(StatusEntregaEnum statusentrega) {
        this.statusentrega = statusentrega;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }
}
