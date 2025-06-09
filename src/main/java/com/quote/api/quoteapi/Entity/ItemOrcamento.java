package com.quote.api.quoteapi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table ( name = "item_orcamento")
@Getter
@Setter

public class ItemOrcamento {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long ID;

    @ManyToOne
    @JoinColumn(name = "id_orcamento", nullable = false)
    private Orcamento orcamento;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private Produto produto;

    @Column (name = "quantidade", nullable = false)
    private int quantidade;

    @Column (name = "desconto", precision = 10, scale = 2)
    private BigDecimal desconto;

}
