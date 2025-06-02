package com.caio.desafio.backend.itau.repository;

import com.caio.desafio.backend.itau.model.Transacao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransacaoRepository {
    private final List<Transacao> listaTransacao = new ArrayList<>();

    public void salvarTransacao(Transacao transacao){
        listaTransacao.add(transacao);
    }

    public void removerTransacao(){ listaTransacao.clear(); }

}
