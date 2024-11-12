package br.com.fiap.tc.logisticaentrega_api.domain.mapper;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.domain.input.CadastrarLogisticaEntregaRequest;
import br.com.fiap.tc.logisticaentrega_api.domain.output.LogisticaEntregaResponse;
import br.com.fiap.tc.logisticaentrega_api.infra.entity.LogisticaEntregaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LogisticaEntregaDtoMapper {

    LogisticaEntregaDtoMapper INSTANCE = Mappers.getMapper(LogisticaEntregaDtoMapper.class);

    /**
     * @param cadastrarLogisticaEntrega
     * @return
     */
    @Mapping(target = "entregaId", ignore = true)
    LogisticaEntrega toLogisticaEntrega(CadastrarLogisticaEntregaRequest cadastrarLogisticaEntrega);

    /**
     * @param logisticaEntrega
     * @return
     */
    LogisticaEntregaResponse toLogisticaEntregaResponse(LogisticaEntrega logisticaEntrega);




}
