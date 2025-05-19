package com.github.guiKD.Livro._Autor.repository;

import com.github.guiKD.Livro._Autor.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
