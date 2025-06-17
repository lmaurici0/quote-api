package com.api.quote.quote_api.Repository;

import com.api.quote.quote_api.Entity.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
    List<Orcamento> findByProfissionalId(Long profissionalId);
}
