package org.example.controller;


import org.example.dtos.AlcanceSismoDTO;
import org.example.dtos.EventoSismoResponseDTO;
import org.example.services.AlcanceSismoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alcance-sismos")
public class AlcanceSismoController {

    private final AlcanceSismoService alcanceSismoService;
    public AlcanceSismoController(AlcanceSismoService alcanceSismoService) {
        this.alcanceSismoService = alcanceSismoService;
    }

    @GetMapping
    public ResponseEntity<List<AlcanceSismoDTO>> listarAlcanceSismo() {
        List<AlcanceSismoDTO> alcances = alcanceSismoService.listarAlcancesSismo();
        return ResponseEntity.ok(alcances);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlcanceSismoDTO> obtenerAlcanceSismoPorId(Long id) {
        AlcanceSismoDTO alcance = alcanceSismoService.obtenerAlcanceSismoPorId(id);
        return alcance != null ? ResponseEntity.ok(alcance) : ResponseEntity.notFound().build();
    }

    // Aquí podrías agregar más métodos para crear, eliminar, etc.
    @PostMapping
    public ResponseEntity<AlcanceSismoDTO> crearAlcanceSismo(AlcanceSismoDTO alcanceSismoDTO) {
        AlcanceSismoDTO nuevoAlcance = alcanceSismoService.crearAlcanceSismo(alcanceSismoDTO);
        return ResponseEntity.status(201).body(nuevoAlcance);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAlcanceSismo(@PathVariable Long id) {
        alcanceSismoService.eliminarAlcanceSismo(id);
        return ResponseEntity.noContent().build();
    }

}
