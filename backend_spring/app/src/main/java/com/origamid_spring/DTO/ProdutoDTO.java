package com.origamid_spring.DTO;

import java.math.BigDecimal;
import java.util.List;

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
public class ProdutoDTO {

       private String id;

       private String nome;

       private BigDecimal preco;

       private String descricao;

       private Boolean vendido;

       private List<Foto> fotos;

       public ProdutoDTO(Produto produto) {
              id = produto.getId();
              nome = produto.getNome();
              preco = produto.getPreco();
              descricao = produto.getDescricao();
              vendido = produto.getVendido();
              fotos = produto.getFotos();
       }
}
