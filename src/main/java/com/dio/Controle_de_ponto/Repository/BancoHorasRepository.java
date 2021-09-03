package com.dio.Controle_de_ponto.Repository;

import com.dio.Controle_de_ponto.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}
