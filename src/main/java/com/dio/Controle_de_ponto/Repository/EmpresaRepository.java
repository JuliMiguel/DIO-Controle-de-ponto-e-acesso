package com.dio.Controle_de_ponto.Repository;

import com.dio.Controle_de_ponto.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
