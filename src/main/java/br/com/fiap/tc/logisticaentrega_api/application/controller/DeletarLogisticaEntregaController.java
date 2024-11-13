package br.com.fiap.tc.logisticaentrega_api.application.controller;

import br.com.fiap.tc.logisticaentrega_api.domain.output.LogisticaEntregaDeletadoResponse;
import br.com.fiap.tc.logisticaentrega_api.domain.usecase.DeletarLogisticaEntregaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/logisticaentregas")
public class DeletarLogisticaEntregaController {

    private  final DeletarLogisticaEntregaUseCase deletarLogisticaEntregaUseCase;

    @DeleteMapping("/{id}")
    public ResponseEntity<LogisticaEntregaDeletadoResponse>deletarLogisticaEntrega(@PathVariable Long id){

        boolean entregaFoiDeletado= deletarLogisticaEntregaUseCase.deletarLogisticaEntrega(id);

        return ResponseEntity.ok(new LogisticaEntregaDeletadoResponse(entregaFoiDeletado));

    }

}
