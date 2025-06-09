package com.quote.api.quoteapi.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ClienteDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String cnpj;
    private String telefone;
}
