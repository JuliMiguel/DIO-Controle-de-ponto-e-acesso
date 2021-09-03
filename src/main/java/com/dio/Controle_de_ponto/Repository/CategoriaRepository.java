package com.dio.Controle_de_ponto.Repository;

import com.dio.Controle_de_ponto.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaUsuario, Long> {
}
