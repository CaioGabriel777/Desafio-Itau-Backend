package com.caio.desafio.backend.itau.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transacao {

    private BigDecimal valor;

    private OffsetDateTime dataHora;

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
}
