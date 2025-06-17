package com.api.quote.quote_api.Controller;

import com.api.quote.quote_api.Entity.Orcamento;
import com.api.quote.quote_api.Service.OrcamentoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/budgets")

public class OrcamentoController {
    @Autowired
    private OrcamentoService orcamentoService;

    @GetMapping("/profissional/{id}/budgets")
    public ResponseEntity<List<Orcamento>> listarPorProfissional(@PathVariable Long id) {
        return ResponseEntity.ok(orcamentoService.findByProfissionalId(id));
    }

    @PostMapping("/save/budget")
    public ResponseEntity<Orcamento> saveBudget(@RequestBody Orcamento orcamento){
        return ResponseEntity.ok(orcamentoService.save(orcamento));
    }

}
