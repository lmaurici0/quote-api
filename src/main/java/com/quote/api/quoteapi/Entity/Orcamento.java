package com.quote.api.quoteapi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table (name = "orcamento")
@Getter
@Setter

public class Orcamento {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long ID;

    @Column (name = "data_orcamento")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_profissional", nullable = false)
    private Profissional profissional;

    @ManyToOne
    @JoinColumn(name = "id_status", nullable = false)
    private StatusOrcamento status;
}