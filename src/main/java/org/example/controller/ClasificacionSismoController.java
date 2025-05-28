package org.example.controller;


import org.example.dtos.ClasificacionSismoDTO;
import org.example.services.ClasificacionSismoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clasificacion-sismos")
public class ClasificacionSismoController {

    private final ClasificacionSismoService clasificacionSismoService;
    public ClasificacionSismoController(ClasificacionSismoService clasificacionSismoService) {
        this.clasificacionSismoService = clasificacionSismoService;
    }

    @GetMapping
    public ResponseEntity<List<ClasificacionSismoDTO>> listarClasificacionesSismo() {
        List<ClasificacionSismoDTO> clasificaciones = clasificacionSismoService.listClasificacionesSismo();
        return ResponseEntity.ok(clasificaciones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClasificacionSismoDTO> obtenerClasificacionSismoPorId(Long id) {
        ClasificacionSismoDTO clasificacion = clasificacionSismoService.getClasificacionSismoById(id);
        return clasificacion != null ? ResponseEntity.ok(clasificacion) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarClasificacionSismo(Long id) {
        clasificacionSismoService.deleteClasificacionSismo(id);
        return ResponseEntity.noContent().build();
    }

}
