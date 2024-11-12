package br.com.fiap.tc.logisticaentrega_api.application.controller;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.input.CadastrarLogisticaEntregaRequest;
import br.com.fiap.tc.logisticaentrega_api.domain.mapper.LogisticaEntregaDtoMapper;
import br.com.fiap.tc.logisticaentrega_api.domain.output.LogisticaEntregaResponse;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.CadastrarLogisticaEntregaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/logisticaentregas")
public class CadastrarLogisticaEntregaController {

    private final LogisticaEntregaDtoMapper logisticaEntregaDtoMapper;
    private final CadastrarLogisticaEntregaUseCase cadastrarLogisticaEntregaUseCase;

    @PostMapping
    public ResponseEntity<LogisticaEntregaResponse>cadastrarLogisticaEntrega(@RequestBody CadastrarLogisticaEntregaRequest cadastrarLogisticaEntregaRequest){

        LogisticaEntrega logisticaEntrega=logisticaEntregaDtoMapper.toLogisticaEntrega(cadastrarLogisticaEntregaRequest);

        LogisticaEntrega logisticaEntregaCadastrado=cadastrarLogisticaEntregaUseCase.cadastraLogisticaEntrega(logisticaEntrega);

        LogisticaEntregaResponse logisticaEntregaResponse = logisticaEntregaDtoMapper.toLogisticaEntregaResponse(logisticaEntregaCadastrado);


        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(logisticaEntregaResponse.entregaId())
                .toUri();

        return ResponseEntity.created(uri).body(logisticaEntregaResponse);

    }


}
