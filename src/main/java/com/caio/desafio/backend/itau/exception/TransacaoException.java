package com.caio.desafio.backend.itau.exception;

public class TransacaoException {

    public class DadosInvalidosException extends RuntimeException{
        public DadosInvalidosException(){
            super();
        }
    }

    public class NegocioException extends RuntimeException{
        public NegocioException(){
            super();
        }
    }
}
