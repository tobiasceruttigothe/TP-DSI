package org.example.controller;


import org.example.dtos.EstadoDTO;
import org.example.services.EstadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    private final EstadoService estadoService;
    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public ResponseEntity<List<EstadoDTO>> listarEstados() {
        List<EstadoDTO> estados = estadoService.listarEstados();
        return ResponseEntity.ok(estados);
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<EstadoDTO> obtenerEstadoPorNombre(String nombre) {
        EstadoDTO estado = estadoService.getEstadoByNombre(nombre);
        return estado != null ? ResponseEntity.ok(estado) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<EstadoDTO> crearEstado(EstadoDTO estadoDTO) {
        EstadoDTO nuevoEstado = estadoService.crearEstado(estadoDTO);
        return ResponseEntity.status(201).body(nuevoEstado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEstado(Long id) {
        estadoService.eliminarEstado(id);
        return ResponseEntity.noContent().build();
    }
}
