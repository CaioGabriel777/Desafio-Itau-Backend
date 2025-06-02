package com.caio.desafio.backend.itau.controller;

import com.caio.desafio.backend.itau.service.EstatisticaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
public class EstatisticaCtrl {

    private final EstatisticaService estatisticaService;
    public EstatisticaCtrl(EstatisticaService estatisticaService) { this.estatisticaService = estatisticaService; }

    @GetMapping
    public DoubleSummaryStatistics buscarTodas(){

        return estatisticaService.buscaEstatistica();
    }
}
