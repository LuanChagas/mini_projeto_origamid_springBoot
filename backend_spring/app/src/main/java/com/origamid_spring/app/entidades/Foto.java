package com.origamid_spring.app.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_FOTOS")
public class Foto {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       private String titulo;

       private String src;

       @ManyToOne
       @JoinColumn(name = "produto_id")
       @JsonIgnore
       private Produto produto;

       @Override
       public String toString() {
              return "Foto [id=" + id + ", produto=" + produto + ", src=" + src + ", titulo=" + titulo + "]";
       }

}
