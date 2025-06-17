package com.api.quote.quote_api.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orcamento")
@Getter
@Setter
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orcamento")
    private Long id;

    @Column(name = "data_orcamento", nullable = false)
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    @JsonManagedReference
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_profissional", nullable = false)
    @JsonManagedReference
    private Profissional profissional;

    @ManyToOne
    @JoinColumn(name = "id_status", nullable = false)
    @JsonManagedReference
    private StatusOrcamento status;

    @ManyToMany
    @JoinTable(
            name = "produto",
            joinColumns = @JoinColumn(name = "id_orcamento"),
            inverseJoinColumns = @JoinColumn(name = "id_produto")
    )
    private List<Produto> produtos;

}