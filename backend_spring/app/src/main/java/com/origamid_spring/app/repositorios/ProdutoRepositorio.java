package com.origamid_spring.app.repositorios;

import com.origamid_spring.app.entidades.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, String> {

}