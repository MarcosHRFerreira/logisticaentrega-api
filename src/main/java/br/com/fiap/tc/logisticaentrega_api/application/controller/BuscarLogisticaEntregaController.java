package br.com.fiap.tc.logisticaentrega_api.application.controller;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.mapper.LogisticaEntregaDtoMapper;
import br.com.fiap.tc.logisticaentrega_api.domain.output.LogisticaEntregaResponse;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.BuscarLogisticaEntregaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/logisticaentregas")

public class BuscarLogisticaEntregaController {

    private final LogisticaEntregaDtoMapper logisticaEntregaDtoMapper;
    private final BuscarLogisticaEntregaUseCase buscarLogisticaEntregaUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<LogisticaEntregaResponse>buscaEntrega(@PathVariable Long id){
        LogisticaEntrega entregaBuscada= buscarLogisticaEntregaUseCase.buscarLogisticaEntregaPorId(id);

        return  ResponseEntity.ok(logisticaEntregaDtoMapper.toLogisticaEntregaResponse(entregaBuscada));

    }


}
