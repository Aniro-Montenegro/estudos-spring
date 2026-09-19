package com.montenegrosistemas.produtosapi.controller;

import com.montenegrosistemas.produtosapi.model.Produto;
import com.montenegrosistemas.produtosapi.repositories.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoRepository produtoRepository;

    public  ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository=produtoRepository;
    }


    @PostMapping
    public void salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto.toString());
       var id= UUID.randomUUID().toString();
       produto.setId(id);;
        produtoRepository.save(produto);
    }
    @GetMapping("/{id}")
    public Produto obterproduto(@PathVariable("id")  String id){
        Optional<Produto> produto= produtoRepository.findById(id);
        return produto.orElse(null);
    }
    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }
    @PutMapping("/{id}")
    public void  atualizar(@PathVariable("id") String id, @RequestBody Produto produto){
            produto.setId(id);
            produtoRepository.save(produto);
    }
    @GetMapping
    public List<Produto> buscarPorParametros(@RequestParam("nome")String nome){
      return  produtoRepository.findByNome(nome);
    }
}
