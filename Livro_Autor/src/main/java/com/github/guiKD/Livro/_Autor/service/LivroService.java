package com.github.guiKD.Livro._Autor.service;

import com.github.guiKD.Livro._Autor.dto.LivroDTO;
import com.github.guiKD.Livro._Autor.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

}
