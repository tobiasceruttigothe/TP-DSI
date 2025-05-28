package org.example.controller;


import org.example.dtos.OrigenGeneracionDTO;
import org.example.services.OrigenGeneracionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/origenes-generacion")
public class OrigenGeneracionController {

    private final OrigenGeneracionService origenGeneracionService;
    public OrigenGeneracionController(OrigenGeneracionService origenGeneracionService) {
        this.origenGeneracionService = origenGeneracionService;
    }

    @GetMapping
    public ResponseEntity<List<OrigenGeneracionDTO>> listarOrigenesGeneracion() {
        List<OrigenGeneracionDTO> origenes = origenGeneracionService.listOrigenesGeneracion();
        return ResponseEntity.ok(origenes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrigenGeneracionDTO> obtenerOrigenGeneracionPorId(Long id) {
        OrigenGeneracionDTO origen = origenGeneracionService.getOrigenGeneracionById(id);
        return origen != null ? ResponseEntity.ok(origen) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarOrigenGeneracion(Long id) {
        origenGeneracionService.deleteOrigenGeneracion(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<OrigenGeneracionDTO> crearOrigenGeneracion(@RequestBody OrigenGeneracionDTO origenGeneracionDTO) {
        OrigenGeneracionDTO nuevoOrigen = origenGeneracionService.createOrigenGeneracion(origenGeneracionDTO);
        return ResponseEntity.status(201).body(nuevoOrigen);
    }
}
