package br.com.fiap.tc.logisticaentrega_api.infra.adapter.repository;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.BuscarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.infra.entity.LogisticaEntregaEntity;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaEntityMapper;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaRepository;
import org.springframework.stereotype.Component;

@Component
public class BuscarLogisticaEntregaPorIdAdapter implements BuscarLogisticaEntregaInterface {

    private final LogisticaEntregaRepository logisticaEntregaRepository;
    private final LogisticaEntregaEntityMapper logisticaEntregaEntityMapper;

    public BuscarLogisticaEntregaPorIdAdapter(LogisticaEntregaRepository logisticaEntregaRepository, LogisticaEntregaEntityMapper logisticaEntregaEntityMapper) {
        this.logisticaEntregaRepository = logisticaEntregaRepository;
        this.logisticaEntregaEntityMapper = logisticaEntregaEntityMapper;
    }


    @Override
    public LogisticaEntrega buscarLogisticaEntregaPorId(Long id){
        LogisticaEntregaEntity entregaBuscada= logisticaEntregaRepository.findById(id).orElse(null);
        return logisticaEntregaEntityMapper.toLogisticaEntregaResponse(entregaBuscada);
    }

}
