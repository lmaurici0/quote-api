package com.api.quote.quote_api.Entity;

import com.api.quote.quote_api.Entity.Enum.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter

public class StatusOrcamento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_status")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column( name = "status_orcamento")
    private Status status;

}
