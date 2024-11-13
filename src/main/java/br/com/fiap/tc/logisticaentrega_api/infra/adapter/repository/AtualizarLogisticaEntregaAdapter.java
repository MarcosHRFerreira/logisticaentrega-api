package br.com.fiap.tc.logisticaentrega_api.infra.adapter.repository;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.AtualizarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.infra.entity.LogisticaEntregaEntity;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaEntityMapper;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AtualizarLogisticaEntregaAdapter implements AtualizarLogisticaEntregaInterface {

    private final LogisticaEntregaRepository logisticaEntregaRepository;
    private final LogisticaEntregaEntityMapper logisticaEntregaEntityMapper;
    private final BuscarLogisticaEntregaPorIdAdapter buscarLogisticaEntregaPorIdAdapter;

    @Override
    public LogisticaEntrega atualizarLogisticaEntrega(Long id, LogisticaEntrega logisticaEntrega){

        LogisticaEntregaEntity entregaAtualizada= logisticaEntregaRepository.save(logisticaEntregaEntityMapper.toEntity(logisticaEntrega));

        return logisticaEntregaEntityMapper.toLogisticaEntregaResponse(entregaAtualizada);

    }



}
