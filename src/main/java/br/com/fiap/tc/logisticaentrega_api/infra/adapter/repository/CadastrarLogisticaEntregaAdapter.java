package br.com.fiap.tc.logisticaentrega_api.infra.adapter.repository;


import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.gateway.CadastrarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.infra.entity.LogisticaEntregaEntity;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaEntityMapper;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CadastrarLogisticaEntregaAdapter implements CadastrarLogisticaEntregaInterface {

    private final LogisticaEntregaRepository logisticaEntregaRepository;
    private final LogisticaEntregaEntityMapper logisticaEntregaEntityMapper;


    @Override
    public LogisticaEntrega cadastraLogisticaEntrega(LogisticaEntrega logisticaEntrega){

        LogisticaEntregaEntity logisticaEntregaEntity= logisticaEntregaEntityMapper.toEntity(logisticaEntrega);
        LogisticaEntregaEntity novoLogisticaEntrega =  logisticaEntregaRepository.save(logisticaEntregaEntity);

        return  logisticaEntregaEntityMapper.toLogisticaEntregaResponse(novoLogisticaEntrega);


    }

}
