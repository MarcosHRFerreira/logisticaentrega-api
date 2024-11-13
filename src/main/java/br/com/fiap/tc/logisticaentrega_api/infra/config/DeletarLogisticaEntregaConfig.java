package br.com.fiap.tc.logisticaentrega_api.infra.config;

import br.com.fiap.tc.logisticaentrega_api.domain.gateway.DeletarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.BuscarLogisticaEntregaUseCase;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.DeletarLogisticaEntregaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeletarLogisticaEntregaConfig {

    @Bean
    public DeletarLogisticaEntregaUseCase deletarLogisticaEntregaUseCase(
            DeletarLogisticaEntregaInterface deletarLogisticaEntregaInterface,
            BuscarLogisticaEntregaUseCase buscarLogisticaEntregaUseCase){

        return  new DeletarLogisticaEntregaUseCase(deletarLogisticaEntregaInterface,buscarLogisticaEntregaUseCase);
    }

}
