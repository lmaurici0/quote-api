package com.api.quote.quote_api.Controller;

import com.api.quote.quote_api.Entity.Produto;
import com.api.quote.quote_api.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/create")
    public ResponseEntity<Produto> save(@RequestBody Produto produto){
        return ResponseEntity.ok(produtoService.saveProducts(produto));
    }

    @GetMapping("/view/all")
    public ResponseEntity<List<Produto>> viewAll(){
        return ResponseEntity.ok(produtoService.listAll());
    }
}
