package com.caio.desafio.backend.itau.service;

import com.caio.desafio.backend.itau.model.Transacao;
import com.caio.desafio.backend.itau.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
public class EstatisticaService{

    private TransacaoRepository repository;
    public EstatisticaService(TransacaoRepository repository) { this.repository = repository; }

    public DoubleSummaryStatistics buscaEstatistica(){
    List<Transacao> listaTransacao = repository.getTransacoes();

        OffsetDateTime dataAtual = OffsetDateTime.now();
        if(dataAtual.getSecond() <= 60){
            DoubleSummaryStatistics estatistica = listaTransacao.stream()
                    .mapToDouble(t -> t.getValor().doubleValue())
                    .summaryStatistics();
            return estatistica;
        }
        return new DoubleSummaryStatistics();
    }

}
