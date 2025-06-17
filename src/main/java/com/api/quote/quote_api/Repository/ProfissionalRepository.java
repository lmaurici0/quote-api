package com.api.quote.quote_api.Repository;

import com.api.quote.quote_api.Entity.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
}
