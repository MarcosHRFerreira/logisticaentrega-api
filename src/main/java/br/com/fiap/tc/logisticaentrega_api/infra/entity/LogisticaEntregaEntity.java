package br.com.fiap.tc.logisticaentrega_api.infra.entity;

import br.com.fiap.tc.logisticaentrega_api.domain.enums.StatusEntregaEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "logisticaentrega")
public class LogisticaEntregaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entregaId;
    @NonNull
    private Long pedidoId;
    @NonNull
    private LocalDateTime dataenvio;
    @NonNull
    private LocalDateTime dataentregaestimanda;
    @Enumerated(EnumType.STRING)
    @NonNull
    private StatusEntregaEnum statusentrega;
    @NonNull
    private String transportadora;

}
