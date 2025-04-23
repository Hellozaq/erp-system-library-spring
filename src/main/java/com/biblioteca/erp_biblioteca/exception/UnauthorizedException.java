package com.biblioteca.erp_biblioteca.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException() {
        super("Acesso não autorizado. Por favor, faça login.");
    }
}