package com.api.quote.quote_api.Service;

import com.api.quote.quote_api.Entity.Orcamento;
import com.api.quote.quote_api.Repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    @Autowired
    private OrcamentoRepository orcamentoRepository;

    public Optional<Orcamento> findById(Long id) {
        return orcamentoRepository.findById(id);
    }

    public List<Orcamento> findByProfissionalId(Long profissionalId) {
        return orcamentoRepository.findByProfissionalId(profissionalId);
    }

    public Orcamento save(Orcamento orcamento) {
        return orcamentoRepository.save(orcamento);
    }

    public void delete(Long id) {
        orcamentoRepository.deleteById(id);
    }
}
