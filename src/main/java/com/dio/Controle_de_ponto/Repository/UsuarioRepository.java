package com.dio.Controle_de_ponto.Repository;

import com.dio.Controle_de_ponto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
