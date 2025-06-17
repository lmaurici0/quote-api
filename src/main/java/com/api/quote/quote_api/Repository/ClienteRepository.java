package com.api.quote.quote_api.Repository;

import com.api.quote.quote_api.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
