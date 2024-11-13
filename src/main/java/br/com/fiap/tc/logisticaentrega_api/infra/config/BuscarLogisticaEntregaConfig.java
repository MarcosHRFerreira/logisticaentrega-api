package br.com.fiap.tc.logisticaentrega_api.infra.config;

import br.com.fiap.tc.logisticaentrega_api.domain.gateway.BuscarLogisticaEntregaInterface;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.BuscarLogisticaEntregaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarLogisticaEntregaConfig {

    @Bean
    public BuscarLogisticaEntregaUseCase buscarLogisticaEntregaUseCase(BuscarLogisticaEntregaInterface buscarLogisticaEntregaInterface){
        return new BuscarLogisticaEntregaUseCase(buscarLogisticaEntregaInterface);
    }

}
