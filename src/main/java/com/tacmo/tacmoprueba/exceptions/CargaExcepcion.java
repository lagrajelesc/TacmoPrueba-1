package com.tacmo.tacmoprueba.exceptions;

public class CargaExcepcion extends Exception {

    private  String message;

    public CargaExcepcion(String message) {
        this.message = message;
    }


    public String getMensaje() {
        return message;
    }

    public void setMensaje(String message) {
        this.message = message;
    }

}
