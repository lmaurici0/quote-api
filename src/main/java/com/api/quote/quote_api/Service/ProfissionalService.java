package com.api.quote.quote_api.Service;


import com.api.quote.quote_api.Entity.Cliente;
import com.api.quote.quote_api.Entity.Profissional;
import com.api.quote.quote_api.Repository.ProfissionalRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfissionalService {
    @Autowired
    private ProfissionalRepository profissionalRepository;

    public Profissional saveProfissional(Profissional profissional){
        return profissionalRepository.save(profissional);
    }

    public List<Profissional> listAll(){
        return profissionalRepository.findAll();
    }

    public Profissional findById(Long id) {
        return profissionalRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Profissional com id " + id + "não encontrado"));
    }



}
