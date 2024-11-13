package br.com.fiap.tc.logisticaentrega_api.infra.config;

import br.com.fiap.tc.logisticaentrega_api.domain.gateway.ListarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.ListarLogisticaEntregaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListarLogisticaEntregaConfig {

    @Bean
    public ListarLogisticaEntregaUseCase listarLogisticaEntregaUseCase(
            ListarLogisticaEntregaInterface listarLogisticaEntregaInterface){
            return new ListarLogisticaEntregaUseCase(listarLogisticaEntregaInterface);
    }

}
