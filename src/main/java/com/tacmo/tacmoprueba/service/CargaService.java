package com.tacmo.tacmoprueba.service;

import com.tacmo.tacmoprueba.exceptions.CargaExcepcion;
import com.tacmo.tacmoprueba.model.Carga;

import java.io.Serializable;
import java.util.List;


public interface CargaService extends Serializable {

    Carga crearCarga(Carga carga) throws CargaExcepcion;

    List<Carga> verInventario();

    Carga buscar(int id);

    Carga actualizarCarga(Carga carga) throws CargaExcepcion;

    List<Carga> buscarFechas(String fecha1, String fecha2) throws CargaExcepcion;


}
