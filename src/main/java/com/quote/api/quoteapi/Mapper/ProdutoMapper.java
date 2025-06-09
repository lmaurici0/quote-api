package com.quote.api.quoteapi.Mapper;

import com.quote.api.quoteapi.DTO.ProdutoDTO;
import com.quote.api.quoteapi.Entity.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdutoMapper {
    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    ProdutoDTO toDTO(Produto entity);
    Produto toEntity(ProdutoDTO dto);
}
