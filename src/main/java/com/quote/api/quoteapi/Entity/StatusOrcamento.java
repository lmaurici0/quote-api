package com.quote.api.quoteapi.Entity;

import com.quote.api.quoteapi.Entity.Enum.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "status_orcamento")
@Getter
@Setter

public class StatusOrcamento {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "status_orcamento")
    private Status status;
}
