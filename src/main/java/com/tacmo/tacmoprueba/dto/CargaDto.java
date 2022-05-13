package com.tacmo.tacmoprueba.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CargaDto implements Serializable {

    private int id;
    private float peso;
    private byte tipoCarga;
    private String destino;
    private LocalDate fecha;
    private boolean estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public byte getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(byte tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
