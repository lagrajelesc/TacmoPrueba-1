package com.tacmo.tacmoprueba.controller;

import com.tacmo.tacmoprueba.exceptions.CargaExcepcion;
import com.tacmo.tacmoprueba.model.Carga;
import com.tacmo.tacmoprueba.service.CargaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tacmoprueba")
public class Controller {

    private CargaService service;

    public Controller(CargaService service) {
        this.service = service;
    }

    @PostMapping("/crear")
    public Carga crearCarga(@RequestBody Carga carga) throws CargaExcepcion{
            return service.crearCarga(carga);
    }

    @GetMapping("/ver")
    public List<Carga> verInventario(){
        return service.verInventario();
    }


    @PutMapping("/actualizar")
    public Carga actualizarCarga(@RequestBody Carga carga) throws CargaExcepcion{
        return service.actualizarCarga(carga);
    }

    @GetMapping("/buscar/{fe1}/{fe2}")
    public List<Carga> buscarFechas(@PathVariable String fe1, @PathVariable String fe2) throws CargaExcepcion {
        return service.buscarFechas(fe1, fe2);
    }
}
