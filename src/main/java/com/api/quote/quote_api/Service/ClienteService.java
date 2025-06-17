package com.api.quote.quote_api.Service;

import com.api.quote.quote_api.Entity.Cliente;
import com.api.quote.quote_api.Repository.ClienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveClient(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAllClients() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente with id " + id + "not found"));
    }

}
