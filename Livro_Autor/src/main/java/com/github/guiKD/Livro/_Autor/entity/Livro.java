package com.github.guiKD.Livro._Autor.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer anoPublicaocao;

    // Relacionamento
    @ManyToMany(mappedBy = "autores", fetch = FetchType.EAGER)
    private Set<Livro> livros = new HashSet<>();
}
