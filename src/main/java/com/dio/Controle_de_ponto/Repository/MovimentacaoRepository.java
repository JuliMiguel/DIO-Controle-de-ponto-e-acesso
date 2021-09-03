package com.dio.Controle_de_ponto.Repository;

import com.dio.Controle_de_ponto.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
