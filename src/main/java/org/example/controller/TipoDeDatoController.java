package org.example.controller;


import org.example.dtos.TipoDeDatoDTO;
import org.example.services.TipoDeDatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-dato")
public class TipoDeDatoController {


    private final TipoDeDatoService tipoDeDatoService;
    public TipoDeDatoController(TipoDeDatoService tipoDeDatoService) {
        this.tipoDeDatoService = tipoDeDatoService;
    }

    @GetMapping
    public ResponseEntity<List<TipoDeDatoDTO>> listarTiposDeDato() {
        List<TipoDeDatoDTO> tiposDeDato = tipoDeDatoService.listTiposDeDato();
        return ResponseEntity.ok(tiposDeDato);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDeDatoDTO> obtenerTipoDeDatoPorId(Long id) {
        TipoDeDatoDTO tipoDeDato = tipoDeDatoService.getTipoDeDatoById(id);
        return tipoDeDato != null ? ResponseEntity.ok(tipoDeDato) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTipoDeDato(Long id) {
        tipoDeDatoService.deleteTipoDeDato(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<TipoDeDatoDTO> crearTipoDeDato(@RequestBody TipoDeDatoDTO tipoDeDatoDTO) {
        TipoDeDatoDTO creado = tipoDeDatoService.createTipoDeDato(tipoDeDatoDTO);
        return ResponseEntity.status(201).body(creado);
    }


}
