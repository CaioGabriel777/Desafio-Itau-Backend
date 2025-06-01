package com.caio.desafio.backend.itau.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record TransacaoDto(BigDecimal valor, OffsetDateTime dataHora) {
}
