package com.aulajavanauta.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
@Builder
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private String numero;
    @Column(name = "complemento",length = 100)
    private String complemento;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep",length = 9)
    private String cep;
    @Column(name = "cidade",length = 150)
    private String cidade;
    @Column(name = "estado",length = 2)
    private String estado;

}
