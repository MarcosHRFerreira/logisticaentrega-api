package br.com.fiap.tc.logisticaentrega_api.application.controller;


import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.input.AtualizarLogisticaEntregaRequest;
import br.com.fiap.tc.logisticaentrega_api.domain.mapper.LogisticaEntregaDtoMapper;
import br.com.fiap.tc.logisticaentrega_api.domain.output.LogisticaEntregaResponse;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.AtualizarLogisticaEntregaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/logisticaentregas")
public class AtualizarLogisticaEntregaController {

    private final LogisticaEntregaDtoMapper logisticaEntregaDtoMapper;
    private final AtualizarLogisticaEntregaUseCase atualizarLogisticaEntregaUseCase;

    @PutMapping("/{id}")
    public ResponseEntity<LogisticaEntregaResponse>atualizarLogisticaEntrega(@PathVariable Long id,
                                                                             @RequestBody AtualizarLogisticaEntregaRequest atualizarLogisticaEntregaRequest){

        LogisticaEntrega entregaAtualizada = atualizarLogisticaEntregaUseCase.atualizarLogisticaEntrega(id,logisticaEntregaDtoMapper.toLogisticaEntrega(atualizarLogisticaEntregaRequest));
        LogisticaEntregaResponse logisticaEntregaResponse = logisticaEntregaDtoMapper.toLogisticaEntregaResponse(entregaAtualizada);

        return ResponseEntity.ok(logisticaEntregaResponse);

    }


}
