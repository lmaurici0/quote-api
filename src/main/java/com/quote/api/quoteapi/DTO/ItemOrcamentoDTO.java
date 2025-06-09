package com.quote.api.quoteapi.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class ItemOrcamentoDTO {
    private Long ID;
    private Long orcamentoId;
    private Long produtoId;
    private int quantidade;
    private BigDecimal desconto;
}
