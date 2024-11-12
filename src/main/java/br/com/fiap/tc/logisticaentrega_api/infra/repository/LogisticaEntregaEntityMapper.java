package br.com.fiap.tc.logisticaentrega_api.infra.repository;

import br.com.fiap.tc.logisticaentrega_api.domain.entity.LogisticaEntrega;
import br.com.fiap.tc.logisticaentrega_api.infra.entity.LogisticaEntregaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LogisticaEntregaEntityMapper {


    LogisticaEntregaEntityMapper INSTANCE = Mappers.getMapper(LogisticaEntregaEntityMapper.class);

    /**
     * @param logisticaentregaEntity
     * @return
     */
    LogisticaEntrega toLogisticaEntregaResponse(LogisticaEntregaEntity logisticaentregaEntity);


    /**
     * @param logisticaentrega
     * @return
     */
    LogisticaEntregaEntity toEntity(LogisticaEntrega logisticaentrega);


}
