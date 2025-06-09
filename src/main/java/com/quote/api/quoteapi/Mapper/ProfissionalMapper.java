package com.quote.api.quoteapi.Mapper;

import com.quote.api.quoteapi.DTO.ProfissionalDTO;
import com.quote.api.quoteapi.Entity.Profissional;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfissionalMapper {
    ProfissionalMapper INSTANCE = Mappers.getMapper(ProfissionalMapper.class);

    ProfissionalDTO toDTO(Profissional entity);
    Profissional toEntity(ProfissionalDTO dto);
}
