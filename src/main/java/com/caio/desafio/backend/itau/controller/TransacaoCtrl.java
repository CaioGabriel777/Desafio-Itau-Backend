package com.caio.desafio.backend.itau.controller;

import com.caio.desafio.backend.itau.dto.TransacaoDto;
import com.caio.desafio.backend.itau.exception.TransacaoException;
import com.caio.desafio.backend.itau.model.Transacao;
import com.caio.desafio.backend.itau.service.TransacaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransacaoCtrl extends TransacaoException{

    private final TransacaoService service;
    public TransacaoCtrl(TransacaoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> enviarTransacao(@RequestBody TransacaoDto dto){
        try{
            Transacao transacao = new Transacao(dto.valor(), dto.dataHora());
            service.enviarTransacao(transacao);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (DadosInvalidosException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (NegocioException e){
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
