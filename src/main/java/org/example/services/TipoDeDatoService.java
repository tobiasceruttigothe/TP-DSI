package org.example.services;


import org.example.dtos.TipoDeDatoDTO;
import org.example.entities.TipoDeDato;
import org.example.repository.TipoDeDatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDeDatoService {


    private final TipoDeDatoRepository tipoDeDatoRepository;
    public TipoDeDatoService(TipoDeDatoRepository tipoDeDatoRepository) {
        this.tipoDeDatoRepository = tipoDeDatoRepository;
    }

}
