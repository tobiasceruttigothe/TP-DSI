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
    public ResponseEntity<List<EventoSismoResponseDTO>> listarEventosSismos() {
        List<EventoSismoResponseDTO> eventos = eventoSismoService.listarEventosSismos();
        return ResponseEntity.ok(eventos);
    }

    @PostMapping
    public ResponseEntity<EventoSismoResponseDTO> crearEventoSismo(@RequestBody EventoSismoCreateDTO eventoSismoDTO) {
        EventoSismoResponseDTO nuevoEvento = eventoSismoService.crearEventoSismo(eventoSismoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEvento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEventoSismo(@PathVariable Long id) {
        eventoSismoService.eliminarEventoSismo(id);
        return ResponseEntity.noContent().build();
    }
    // Aquí podrías agregar más métodos para buscar por ID, actualizar, etc.
    @GetMapping("/{id}")
    public ResponseEntity<EventoSismoResponseDTO> obtenerEventoSismoPorId(@PathVariable Long id) {
        EventoSismoResponseDTO evento = eventoSismoService.obtenerEventoSismoPorId(id);
        return evento != null ? ResponseEntity.ok(evento) : ResponseEntity.notFound().build();
    }
}

/*
    @PostMapping
    public ResponseEntity<UsuarioRespuestaDTO> crearUsuario(@Valid @RequestBody UsuarioCrearDTO usuarioCrearDTO) {
        UsuarioRespuestaDTO creado = usuarioService.crearUsuario(usuarioCrearDTO);
        return new ResponseEntity<>(creado, HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
        return ResponseEntity.noContent().build();
    }

    // Para buscar por id: (podés crear un DTO similar para la respuesta)
*/

