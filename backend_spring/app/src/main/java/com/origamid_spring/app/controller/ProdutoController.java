package com.origamid_spring.app.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import com.origamid_spring.DTO.ProdutoDTO;
import com.origamid_spring.app.entidades.Foto;
import com.origamid_spring.app.entidades.Produto;
import com.origamid_spring.app.servicos.ProdutoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

       @Autowired
       private ProdutoServico produtoServico;

       @PostMapping
       public String createProduto(@RequestBody Produto produto) {
              /*
               * essa função, essa pequena função, (addFotos), me fez andar em circulos por
               * cerca de 6 horas. Mas no final, deu tudo certo!!!
               */
              if (!produto.getFotos().isEmpty()) {
                     List<Foto> fotos = produto.getFotos().stream().collect(Collectors.toList());
                     for (Foto foto : fotos) {
                            produto.addFoto(foto);
                     }
              }
              produtoServico.createProduto(produto);
              return "ok";
       }

       @CrossOrigin
       @GetMapping
       public List<ProdutoDTO> findAll() {
              return produtoServico.findAll();
       }

       @CrossOrigin
       @GetMapping("/{id}")
       public ResponseEntity<ProdutoDTO> findById(@PathVariable("id") String id) {

              return ResponseEntity.ok(produtoServico.findById(id)
                            .orElseThrow(() -> new NoSuchElementException("Produto não encontrado")));
       }

}
