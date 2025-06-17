package com.api.quote.quote_api.Entity;

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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_produto")
    private Long id;

    @Column (name = "nome_produto", nullable = false)
    private String nome;

    @Column (name = "preco_produto", nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

    @Column (name = "marca_produto", nullable = false)
    private String marca;
}