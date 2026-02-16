package com.Projeto.InicioComSpring.Services.Exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }

    private static final long serialVersionUID = 1L;
}
