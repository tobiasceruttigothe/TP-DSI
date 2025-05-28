package org.example.controller;


import org.example.dtos.EstadoDTO;
import org.example.dtos.MagnitudRitcherDTO;
import org.example.entities.MagnitudRitcher;
import org.example.services.MagnitudRitcherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magnitud-ritcher")
public class MagnitudRitcherController {


    private final MagnitudRitcherService magnitudRitcherService;
    public MagnitudRitcherController(MagnitudRitcherService magnitudRitcherService) {
        this.magnitudRitcherService = magnitudRitcherService;
    }

    @GetMapping
    public ResponseEntity<List<MagnitudRitcherDTO>> obtenerMagnitudRitcher() {
        List<MagnitudRitcherDTO> magnitudRitcher = magnitudRitcherService.listarMagnitudesRitcher();
        return ResponseEntity.ok(magnitudRitcher);
    }

    @PostMapping
    public ResponseEntity<MagnitudRitcherDTO> crearMagnitudRitcher(MagnitudRitcherDTO magnitudRitcherDTO) {
        MagnitudRitcherDTO nuevaMagnitud = magnitudRitcherService.crearMagnitudRitcher(magnitudRitcherDTO);
        return ResponseEntity.status(201).body(nuevaMagnitud);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMagnitudRitcher(@PathVariable Long id) {
        magnitudRitcherService.eliminarMagnitudRitcher(id);
        return ResponseEntity.noContent().build();
    }

}
