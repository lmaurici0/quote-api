package com.api.quote.quote_api.Controller;

import com.api.quote.quote_api.Entity.Orcamento;
import com.api.quote.quote_api.Entity.Profissional;
import com.api.quote.quote_api.Service.ClienteService;
import com.api.quote.quote_api.Service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController {
    @Autowired
    private ProfissionalService profissionalService;

    @GetMapping("/view/all")
    public ResponseEntity<List<Profissional>> listar(){
        return ResponseEntity.ok(profissionalService.listAll());
    }

    @PostMapping("/auth/save")
    public ResponseEntity<Profissional> save(@RequestBody Profissional profissional){
        return ResponseEntity.ok(profissionalService.saveProfissional(profissional));
    }

}
