package com.dio.Controle_de_ponto.Repository;

import com.dio.Controle_de_ponto.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
