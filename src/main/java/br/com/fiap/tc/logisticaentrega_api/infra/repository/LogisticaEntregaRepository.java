package br.com.fiap.tc.logisticaentrega_api.infra.repository;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.infra.entity.LogisticaEntregaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogisticaEntregaRepository extends JpaRepository<LogisticaEntregaEntity,Long> {
}
