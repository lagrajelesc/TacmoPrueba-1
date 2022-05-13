package com.tacmo.tacmoprueba.serviceImpl;

import com.tacmo.tacmoprueba.exceptions.CargaExcepcion;
import com.tacmo.tacmoprueba.model.Carga;
import com.tacmo.tacmoprueba.repository.CargaRepository;
import com.tacmo.tacmoprueba.service.CargaService;
import com.tacmo.tacmoprueba.validator.Validator;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;


@Component
public class CargaServiceImpl implements CargaService {

    private CargaRepository cargaRepository;

    public CargaServiceImpl(CargaRepository cargaRepository) {
        this.cargaRepository = cargaRepository;
    }


    @Override
    public Carga crearCarga(Carga carga) throws CargaExcepcion {
        Carga crg = new Carga();
        new Validator(carga.getPeso());
        new Validator(carga.getTipoCarga());
        new Validator(carga.getDestino());
        crg.setPeso(carga.getPeso());
        crg.setTipoCarga(carga.getTipoCarga());
        crg.setDestino(carga.getDestino());
        LocalDate fecha = LocalDate.now();
        crg.setFecha(fecha);
        crg.setEstado(true);
        cargaRepository.save(crg);
        return cargaRepository.despuesCrear(crg.getId());

    }


    @Override
    public List<Carga> verInventario() {
        return cargaRepository.findAll();
    }

    @Override
    public Carga buscar(int id) {
        return (Carga) cargaRepository.findAllById(Collections.singleton(id));
    }


    @Override
    public Carga actualizarCarga(Carga carga) throws CargaExcepcion {
        Carga crg = cargaRepository.buscarCarga(carga.getId());
        if (crg.getId() != 0) {
            new Validator(carga.getPeso());
            new Validator(carga.getTipoCarga());
            new Validator(carga.getDestino());
            crg.setPeso(carga.getPeso());
            crg.setTipoCarga(carga.getTipoCarga());
            crg.setDestino(carga.getDestino());
            cargaRepository.save(crg);
        }

        return cargaRepository.despuesCrear(crg.getId());
    }

    @Override
    public List<Carga> buscarFechas(String fecha1, String fecha2) throws CargaExcepcion {
        if (validarFecha(fecha1) && validarFecha(fecha2)) {
            new Validator(fecha1, fecha2);
            return cargaRepository.buscarPorFechas(fecha1, fecha2);
        }

        return null;
    }


    public Boolean validarFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        try {
            formato.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }
}
