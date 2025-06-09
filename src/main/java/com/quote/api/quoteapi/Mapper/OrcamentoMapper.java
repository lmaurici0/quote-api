package com.quote.api.quoteapi.Mapper;

import com.quote.api.quoteapi.DTO.OrcamentoDTO;
import com.quote.api.quoteapi.Entity.Orcamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrcamentoMapper {
    OrcamentoMapper INSTANCE = Mappers.getMapper(OrcamentoMapper.class);

    @Mapping(source = "cliente.id", target = "clienteId")
    @Mapping(source = "profissional.id", target = "profissionalId")
    @Mapping(source = "status.id", target = "statusId")
    OrcamentoDTO toDTO(Orcamento entity);

    @Mapping(source = "clienteId", target = "cliente.id")
    @Mapping(source = "profissionalId", target = "profissional.id")
    @Mapping(source = "statusId", target = "status.id")
    Orcamento toEntity(OrcamentoDTO dto);
}
