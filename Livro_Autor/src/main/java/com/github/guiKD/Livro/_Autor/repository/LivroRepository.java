package com.github.guiKD.Livro._Autor.repository;

import com.github.guiKD.Livro._Autor.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
