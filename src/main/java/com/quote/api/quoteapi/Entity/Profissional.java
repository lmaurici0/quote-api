package com.quote.api.quoteapi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "profissional")
@Getter
@Setter

public class Profissional {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "nome_profissional")
    private String nome;
}
