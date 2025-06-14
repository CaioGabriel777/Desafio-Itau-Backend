package com.caio.desafio.backend.itau.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;

public class Transacao {

    private BigDecimal valor;

    private OffsetDateTime dataHora;

    private DoubleSummaryStatistics estatisticas;

    protected Transacao(){}

    public Transacao(BigDecimal valor, OffsetDateTime dataHora){
        this();
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public DoubleSummaryStatistics getEstatisticas() {
        return estatisticas;
    }

    public void setEstatisticas(DoubleSummaryStatistics estatisticas) {
        this.estatisticas = estatisticas;
    }
}
