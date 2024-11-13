package br.com.fiap.tc.logisticaentrega_api.infra.adapter.repository;


import br.com.fiap.tc.logisticaentrega_api.domain.gateway.DeletarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarLogisticaEntregaAdapter implements DeletarLogisticaEntregaInterface {

    private final LogisticaEntregaRepository logisticaEntregaRepository;

    @Override
    public boolean deletarLogisticaEntrega(Long id){
         logisticaEntregaRepository.deleteById(id);
         return  true;
    }
}
