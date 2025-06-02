package com.caio.desafio.backend.itau.dto;

import java.time.OffsetDateTime;

public record TransacaoDto(Double valor, OffsetDateTime dataHora) {
}
