package com.quote.api.quoteapi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "cliente")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long ID;

    @Column (name = "nome_cliente", nullable = false)
    private String nome;

    @Column (name= "cpf_cliente")
    private String cpf;

    @Column (name = "cnpj_cliente")
    private  String cnpj;

    @Column (name = "telefone_cliente")
    private String telefone;

}
