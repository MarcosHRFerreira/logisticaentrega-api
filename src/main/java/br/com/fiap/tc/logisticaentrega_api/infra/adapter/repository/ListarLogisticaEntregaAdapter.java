package br.com.fiap.tc.logisticaentrega_api.infra.adapter.repository;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.ListarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaEntityMapper;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarLogisticaEntregaAdapter implements ListarLogisticaEntregaInterface {

    private final LogisticaEntregaRepository logisticaEntregaRepository;
    private final LogisticaEntregaEntityMapper logisticaEntregaEntityMapper;

    @Override
    public List<LogisticaEntrega> listarLogisticaEntregas(){
        return logisticaEntregaRepository.findAll().stream().map(logisticaEntregaEntityMapper::toLogisticaEntregaResponse).toList();
    }


}
