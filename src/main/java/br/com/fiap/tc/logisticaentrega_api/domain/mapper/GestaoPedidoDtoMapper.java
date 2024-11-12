package br.com.fiap.tc.logisticaentrega_api.domain.mapper;


import br.com.fiap.tc.logisticaentrega_api.domain.entity.GestaoPedido;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface GestaoPedidoDtoMapper {

    GestaoPedidoDtoMapper INSTANCE = Mappers.getMapper(GestaoPedidoDtoMapper.class);

    GestaoPedido toGestaoPedido(GestaoPedido gestaoPedido);



}
