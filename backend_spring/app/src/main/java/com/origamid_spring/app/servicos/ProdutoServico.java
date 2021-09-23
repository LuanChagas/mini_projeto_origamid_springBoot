package com.origamid_spring.app.servicos;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.origamid_spring.DTO.ProdutoDTO;
import com.origamid_spring.app.entidades.Produto;
import com.origamid_spring.app.repositorios.ProdutoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServico {

       @Autowired
       private ProdutoRepositorio produtoRepositorio;

       public Produto createProduto(Produto produto) {
              return produtoRepositorio.save(produto);
       }

       public List<ProdutoDTO> findAll() {
              List<Produto> produto = produtoRepositorio.findAll();
              return produto.stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
       }

       public Optional<ProdutoDTO> findById(String id) {
              Optional<Produto> produto = produtoRepositorio.findById(id);
              Optional<ProdutoDTO> produtoDTO = Optional.of(new ProdutoDTO(produto.get()));
              return produtoDTO;
       }
}
