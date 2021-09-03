package com.dio.Controle_de_ponto.Service;


import com.dio.Controle_de_ponto.Repository.CategoriaRepository;
import com.dio.Controle_de_ponto.model.CategoriaUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public CategoriaUsuario saveCategoria(CategoriaUsuario categoriaUsuario){
        return categoriaRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long idCategoria) {
        return categoriaRepository.findById(idCategoria);
    }

    public CategoriaUsuario updateCategoria(CategoriaUsuario categoriaUsuario) {
        return categoriaRepository.save(categoriaUsuario);
    }

    public void deleteCategoria(Long idCategoria) { categoriaRepository.deleteById(idCategoria); }
}
