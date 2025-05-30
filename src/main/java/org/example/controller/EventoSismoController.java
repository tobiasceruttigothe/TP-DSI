package org.example.controller;


import org.example.dtos.EventoSismoCreateDTO;
import org.example.dtos.EventoSismoResponseDTO;
import org.example.services.EventoSismoService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos-sismos")
public class EventoSismoController {

    private final EventoSismoService eventoSismoService;

    public EventoSismoController(EventoSismoService eventoSismoService) {
        this.eventoSismoService = eventoSismoService;
    }

    @GetMapping
    public ResponseEntity<List<EventoSismoResponseDTO>> listarEventosSismosAutodetectados() {
        List<EventoSismoResponseDTO> eventos = eventoSismoService.buscarEventosAutodetectados();
        return ResponseEntity.ok(eventos);
    }
}

