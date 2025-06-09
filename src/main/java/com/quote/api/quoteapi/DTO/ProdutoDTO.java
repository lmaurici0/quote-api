package com.quote.api.quoteapi.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class ProdutoDTO {
    private Long ID;
    private String nome;
    private BigDecimal preco;
    private BigDecimal desconto;
    private String marca;
}
