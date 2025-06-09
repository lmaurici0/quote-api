package com.quote.api.quoteapi.Mapper;

import com.quote.api.quoteapi.DTO.StatusOrcamentoDTO;
import com.quote.api.quoteapi.Entity.StatusOrcamento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StatusOrcamentoMapper {
    StatusOrcamentoMapper INSTANCE = Mappers.getMapper(StatusOrcamentoMapper.class);

    StatusOrcamentoDTO toDTO(StatusOrcamento entity);
    StatusOrcamento toEntity(StatusOrcamentoDTO dto);
}
