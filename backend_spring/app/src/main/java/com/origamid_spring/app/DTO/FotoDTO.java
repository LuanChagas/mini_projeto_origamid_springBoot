package com.origamid_spring.app.DTO;

import com.origamid_spring.app.entidades.Foto;
import com.origamid_spring.app.entidades.Produto;

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
public class FotoDTO {

       private Long id;

       private String titulo;

       private String src;

       private Produto produto;

       public FotoDTO(Foto foto) {
              id = foto.getId();
              titulo = foto.getTitulo();
              src = foto.getSrc();
              produto = foto.getProduto();
       }
}
