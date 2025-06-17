package com.api.quote.quote_api.Service;

import com.api.quote.quote_api.Entity.Cliente;
import com.api.quote.quote_api.Entity.Produto;
import com.api.quote.quote_api.Entity.Profissional;
import com.api.quote.quote_api.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service

public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto saveProducts(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> listAll(){
        return produtoRepository.findAll();
    }

}
