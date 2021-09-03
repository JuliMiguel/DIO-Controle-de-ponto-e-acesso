package com.dio.Controle_de_ponto.Service;

import com.dio.Controle_de_ponto.Repository.MovimentacaoRepository;
import com.dio.Controle_de_ponto.model.Movimentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) { this.movimentacaoRepository = movimentacaoRepository; }

    public Movimentacao saveMovimentacao(Movimentacao movimentacao){ return movimentacaoRepository.save(movimentacao); }

    public List<Movimentacao> findAll() { return movimentacaoRepository.findAll(); }

    public Optional<Movimentacao> getById(Long idMovimentacao) { return movimentacaoRepository.findById(idMovimentacao); }

    public Movimentacao updateMovimentacao(Movimentacao movimentacao) {return movimentacaoRepository.save(movimentacao); }

    public void deleteMovimentacao(Long idMovimentacao) { movimentacaoRepository.deleteById(idMovimentacao); }
}
