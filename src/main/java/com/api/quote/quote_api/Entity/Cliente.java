package com.api.quote.quote_api.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table (name = "cliente")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_cliente")
    private Long id;

    @Column (name = "nome_cliente", nullable = false)
    private String nome;

    @Column (name = "cpf_cliente")
    private String cpf;

    @Column (name = "cnpj_cliente")
    private String cnpj;

    @Column (name = "telefone_cliente", nullable = false)
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    @JsonBackReference
    private List<Orcamento> orcamentos;
}
