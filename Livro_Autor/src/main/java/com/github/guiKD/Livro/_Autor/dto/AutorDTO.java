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
public class AutorDTO {

    private Long id;
    @NotNull
    @Size(max = 100, message = "O nome deve ter até 100 caracteres")
    private String name;
    @NotNull
    @Size(max = 50, message = "O email deve ter até 50 caracteres")
    private String email;

}
