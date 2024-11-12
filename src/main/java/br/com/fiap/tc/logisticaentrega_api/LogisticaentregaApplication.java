package br.com.fiap.tc.logisticaentrega_api;

import br.com.fiap.tc.logisticaentrega_api.infra.feign.CustomErrorDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.fiap.tc.logisticaentrega_api"})
@EnableFeignClients(basePackages = {"br.com.fiap.tc.logisticaentrega_api.infra.feign"})

public class LogisticaentregaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticaentregaApplication.class, args);
	}

	@Bean
	public CustomErrorDecoder errorDecoder() {
		return new CustomErrorDecoder();
	}

}
