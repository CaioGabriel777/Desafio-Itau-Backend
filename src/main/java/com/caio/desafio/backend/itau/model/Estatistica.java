package com.caio.desafio.backend.itau.model;

import java.util.DoubleSummaryStatistics;

public class Estatistica {

    private Long count;

    private Double sum;

    private Double average;

    private Double min;

    private Double max;

    protected Estatistica() {}

    public Estatistica(DoubleSummaryStatistics estatisticas) {
        this();
        this.count = estatisticas.getCount();
        this.sum = estatisticas.getSum();
        this.average = estatisticas.getAverage();
        this.min = estatisticas.getMin();
        this.max = estatisticas.getMax();
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }
}
