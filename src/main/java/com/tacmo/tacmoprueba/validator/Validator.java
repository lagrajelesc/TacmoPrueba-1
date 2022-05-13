package com.tacmo.tacmoprueba.validator;

import com.tacmo.tacmoprueba.exceptions.CargaExcepcion;

import java.time.LocalDate;

public class Validator {

    public Validator(float peso) throws CargaExcepcion {
        if ((peso <= 0 || peso > 200)) {
            throw new CargaExcepcion("El peso ingresado se sale del rango");
        }
    }

    public Validator(byte tipoCarga) throws CargaExcepcion {
        if ((tipoCarga <= 0 || tipoCarga > 4)) {
            throw new CargaExcepcion("El tipo de carga selecionado no existe");
        }
    }

    public Validator(String destino) throws CargaExcepcion {
        if (destino.length() > 20) {
            throw new CargaExcepcion("El destino debe contener máximo 20 caracteres");
        }
    }

    public Validator(String fecha1, String fecha2) throws CargaExcepcion {
        if (fecha1.equals(fecha2)) {
            throw new CargaExcepcion("Las fechas ingresadas deben ser diferentes");
        }
    }

}
