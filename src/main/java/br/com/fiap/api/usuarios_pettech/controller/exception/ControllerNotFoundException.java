package br.com.fiap.api.usuarios_pettech.controller.exception;

public class ControllerNotFoundException extends RuntimeException {

    public ControllerNotFoundException (String msg) {
        super(msg);
    }

}
