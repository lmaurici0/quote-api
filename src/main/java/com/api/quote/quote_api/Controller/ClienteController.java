package com.api.quote.quote_api.Controller;


import com.api.quote.quote_api.Entity.Cliente;
import com.api.quote.quote_api.Service.ClienteService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/auth/save")
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.saveClient(cliente));
    }

    @GetMapping("/viewall")
    public ResponseEntity<List<Cliente>> listarTodos() {
        return ResponseEntity.ok(clienteService.findAllClients());
    }

}
