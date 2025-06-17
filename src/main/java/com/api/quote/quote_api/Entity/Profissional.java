package com.api.quote.quote_api.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "profissional")
@Getter
@Setter

public class Profissional {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_profissional")
    private Long id;

    @Column (name = "nome_profissional", nullable = false)
    private String nome;

}
