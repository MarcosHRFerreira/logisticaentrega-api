package br.com.fiap.tc.logisticaentrega_api.infra.config;

import br.com.fiap.tc.logisticaentrega_api.domain.gateway.AtualizarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.AtualizarLogisticaEntregaUseCase;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.BuscarLogisticaEntregaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtualizarLogisticaEntregaConfig {

    @Bean
    public AtualizarLogisticaEntregaUseCase atualizarLogisticaEntregaUseCase(AtualizarLogisticaEntregaInterface atualizarLogisticaEntregaInterface,
                                                                             BuscarLogisticaEntregaUseCase buscarLogisticaEntregaUseCase){

        return  new AtualizarLogisticaEntregaUseCase(atualizarLogisticaEntregaInterface,buscarLogisticaEntregaUseCase);

    }
}
