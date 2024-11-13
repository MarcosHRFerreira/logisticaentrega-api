package br.com.fiap.tc.logisticaentrega_api.application.controller;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.mapper.LogisticaEntregaDtoMapper;
import br.com.fiap.tc.logisticaentrega_api.domain.output.LogisticaEntregaResponse;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.ListarLogisticaEntregaUseCase;
import br.com.fiap.tc.logisticaentrega_api.infra.repository.LogisticaEntregaEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/logisticaentregas")
public class ListarLogisticaEntregaController {

    private final LogisticaEntregaEntityMapper logisticaEntregaEntityMapper;
    private final ListarLogisticaEntregaUseCase listarLogisticaEntregaUseCase;
    private final LogisticaEntregaDtoMapper logisticaEntregaDtoMapper;

    @GetMapping
    public ResponseEntity<List<LogisticaEntregaResponse>>listarLogisticaEntregas(){
        List<LogisticaEntrega> entregas = listarLogisticaEntregaUseCase.listarLogisticaEntregas();
        List<LogisticaEntregaResponse>listarLogisticaEntregaResponse=entregas.stream().map(logisticaEntregaDtoMapper::toLogisticaEntregaResponse).toList();
        return ResponseEntity.ok(listarLogisticaEntregaResponse);
    }


}
