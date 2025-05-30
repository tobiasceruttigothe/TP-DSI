package org.example.services;


import org.example.dtos.EstacionSismologicaDTO;
import org.example.entities.EstacionSismologica;
import org.example.repository.EstacionSismologicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionSismologicaService {

    private final EstacionSismologicaRepository estacionSismologicaRepository;

    public EstacionSismologicaService(EstacionSismologicaRepository estacionSismologicaRepository) {
        this.estacionSismologicaRepository = estacionSismologicaRepository;
    }

}
