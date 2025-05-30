package org.example.services;

import org.example.dtos.OrigenGeneracionDTO;
import org.example.entities.OrigenGeneracion;
import org.example.repository.OrigenGeneracionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrigenGeneracionService {

    private final OrigenGeneracionRepository origenGeneracionRepository;
    public OrigenGeneracionService(OrigenGeneracionRepository origenGeneracionRepository) {
        this.origenGeneracionRepository = origenGeneracionRepository;
    }

}
