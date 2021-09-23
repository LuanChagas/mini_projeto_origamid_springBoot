package com.origamid_spring.app.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.origamid_spring.app.DTO.ProdutoDTO;

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
@Table(name = "TB_PRODUTOS")
public class Produto {
       @Id
       private String id;

       private String nome;

       private BigDecimal preco;

       private String descricao;

       private Boolean vendido;

       @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
       private List<Foto> fotos;

       public Produto(ProdutoDTO dto) {
              id = dto.getId();
              nome = dto.getNome();
              preco = dto.getPreco();
              descricao = dto.getDescricao();
              vendido = dto.getVendido();
              fotos = dto.getFotos();
       }

       public void addFoto(Foto foto) {
              if (foto != null) {
                     if (fotos == null) {
                            fotos = new ArrayList<Foto>();
                     }
                     fotos.add(foto);
                     foto.setProduto(this);
              }
       }

}
