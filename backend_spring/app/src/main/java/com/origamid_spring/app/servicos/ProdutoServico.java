package com.origamid_spring.app.servicos;

import java.util.List;

import com.origamid_spring.app.entidades.Produto;
import com.origamid_spring.app.repositorios.ProdutoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServico {

       @Autowired
       private ProdutoRepositorio produtoRepositorio;

       public Produto createProduto(Produto produto) {
              System.out.println(produto.toString());
              return produtoRepositorio.save(produto);

       }

       public List<Produto> findAll() {
              return produtoRepositorio.findAll();
       }
}
