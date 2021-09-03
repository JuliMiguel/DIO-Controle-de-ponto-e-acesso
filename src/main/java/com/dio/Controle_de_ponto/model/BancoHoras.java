package com.dio.Controle_de_ponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class BancoHoras {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class BancoHorasId implements Serializable {
        private Long idBancoHoras;
        private Long idMovimentacao;
        private Long idUsuario;
    }
    @Id
    @EmbeddedId
    @GeneratedValue
    private BancoHorasId id;
    private LocalDateTime dataTrabalhado;
    private BigDecimal quantidadeHors;
    private BigDecimal saldoHoras;
}
