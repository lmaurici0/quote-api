package com.quote.api.quoteapi.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class OrcamentoDTO {
    private Long ID;
    private LocalDate data;
    private Long clienteId;
    private Long profissionalId;
    private Long statusId;
}
