package com.github.guiKD.Livro._Autor.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LivroDTO {

    private Long id;
    @NotNull
    @Size(max = 150, message = "O título deve ter até 150 caracteres")
    private String titulo;
    @NotNull
    private Integer anoPublicacao;

}
