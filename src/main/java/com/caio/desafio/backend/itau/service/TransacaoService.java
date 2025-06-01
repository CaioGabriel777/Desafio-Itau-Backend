package com.caio.desafio.backend.itau.service;

import com.caio.desafio.backend.itau.exception.TransacaoException;
import com.caio.desafio.backend.itau.model.Transacao;
import com.caio.desafio.backend.itau.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Service
public class TransacaoService extends TransacaoException{

    private final TransacaoRepository repository;
    public TransacaoService(TransacaoRepository repository){
        this.repository = repository;
    }

    public void validarTransacao(Transacao transacao){

        // Validar Valores
        if(transacao.getValor() == null){
            throw new DadosInvalidosException();
        }
        if(transacao.getValor().compareTo(BigDecimal.ZERO) < 0){
            throw new NegocioException();
        }

        // Validar Data
        if (transacao.getDataHora() == null){
            throw new DadosInvalidosException();
        }
        if (transacao.getDataHora().isAfter(OffsetDateTime.now())){
            throw new NegocioException();
        }
    }

    public void enviarTransacao(Transacao transacao){

        validarTransacao(transacao);

        repository.salvarTransacao(transacao);
    }

}
