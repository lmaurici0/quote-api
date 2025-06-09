package com.quote.api.quoteapi.DTO;

import com.quote.api.quoteapi.Entity.Enum.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StatusOrcamentoDTO {
    private Long id;
    private Status status;
}
