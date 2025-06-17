package com.api.quote.quote_api.Repository;

import com.api.quote.quote_api.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
