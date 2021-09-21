package com.origamid_spring.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_FOTOS")
public class Foto {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private String id;

       private String titulo;

       private String src;
       @ManyToOne
       @JoinColumn(name = "produto_id", nullable = false)
       private Produto produto;

}
