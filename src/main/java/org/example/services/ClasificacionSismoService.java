package org.example.services;


import org.example.dtos.ClasificacionSismoDTO;
import org.example.entities.ClasificacionSismo;
import org.example.repository.ClasificacionSismoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionSismoService {

    private final ClasificacionSismoRepository clasificacionSismoRepository;
    public ClasificacionSismoService(ClasificacionSismoRepository clasificacionSismoRepository) {
        this.clasificacionSismoRepository = clasificacionSismoRepository;
    }
}
