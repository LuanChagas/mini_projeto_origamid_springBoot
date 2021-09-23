package com.origamid_spring.app.repositorios;

import com.origamid_spring.app.entidades.Foto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepositorio extends JpaRepository<Foto, Long> {

}