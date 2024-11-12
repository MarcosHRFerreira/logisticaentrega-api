package br.com.fiap.tc.logisticaentrega_api.infra.feign;


import br.com.fiap.tc.logisticaentrega_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.logisticaentrega_api.infra.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gestaopedido", primary = false, url = "${application.client.host}",
            configuration = FeignConfiguration.class)
public interface ConsultarGestaoPedidoPorID {

    /**
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    GestaoPedido consultaGestaoPedidoPorID(@PathVariable("id") Long id);


}
