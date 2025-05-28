package org.example.controller;


import org.example.dtos.EstacionSismologicaDTO;
import org.example.services.EstacionSismologicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estaciones-sismologicas")
public class EstacionSismologicaController {

    private final EstacionSismologicaService estacionSismologicaService;
    public EstacionSismologicaController(EstacionSismologicaService estacionSismologicaService) {
        this.estacionSismologicaService = estacionSismologicaService;
    }

    @GetMapping
    public ResponseEntity<List<EstacionSismologicaDTO>> listarEstacionesSismologicas() {
        List<EstacionSismologicaDTO> estaciones = estacionSismologicaService.listEstacionesSismologicas();
        return ResponseEntity.ok(estaciones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstacionSismologicaDTO> obtenerEstacionSismologicaPorId(Long id) {
        EstacionSismologicaDTO estacion = estacionSismologicaService.getEstacionSismologicaById(id);
        return estacion != null ? ResponseEntity.ok(estacion) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEstacionSismologica(Long id) {
        estacionSismologicaService.deleteEstacionSismologica(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<EstacionSismologicaDTO> crearEstacionSismologica(@RequestBody EstacionSismologicaDTO estacionSismologicaDTO) {
        EstacionSismologicaDTO creado = estacionSismologicaService.createEstacionSismologica(estacionSismologicaDTO);
        return ResponseEntity.status(201).body(creado);
    }

}
