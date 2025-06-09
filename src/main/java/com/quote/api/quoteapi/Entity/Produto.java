package com.quote.api.quoteapi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table (name = "produto")
@Getter
@Setter

public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long ID;

    @Column (name = "nome_produto", nullable = false)
    private String nome;

    @Column (name = "preco_produto", precision = 10, scale = 2, nullable = false)
    private BigDecimal preco;

    @Column (name = "desconto_produto", precision = 10, scale = 2)
    private BigDecimal desconto;

    @Column (name = "marca_produto", nullable = false)
    private String marca;

}
