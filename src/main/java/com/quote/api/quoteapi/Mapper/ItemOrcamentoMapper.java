package com.quote.api.quoteapi.Mapper;

import com.quote.api.quoteapi.DTO.ItemOrcamentoDTO;
import com.quote.api.quoteapi.Entity.ItemOrcamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemOrcamentoMapper {
    ItemOrcamentoMapper INSTANCE = Mappers.getMapper(ItemOrcamentoMapper.class);

    @Mapping(source = "orcamento.id", target = "orcamentoId")
    @Mapping(source = "produto.id", target = "produtoId")
    ItemOrcamentoDTO toDTO(ItemOrcamento entity);

    @Mapping(source = "orcamentoId", target = "orcamento.id")
    @Mapping(source = "produtoId", target = "produto.id")
    ItemOrcamento toEntity(ItemOrcamentoDTO dto);
}
