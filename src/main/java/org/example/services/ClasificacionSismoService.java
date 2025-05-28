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


    public ClasificacionSismoDTO createClasificacionSismo(ClasificacionSismoDTO clasificacionSismoDTO) {
        ClasificacionSismo clasificacionSismo = new ClasificacionSismo();
        clasificacionSismo.setKmProfundidadDesde(clasificacionSismoDTO.getKmProfundidadDesde());
        clasificacionSismo.setKmProfundidadHasta(clasificacionSismoDTO.getKmProfundidadHasta());
        ClasificacionSismo savedClasificacion = clasificacionSismoRepository.save(clasificacionSismo);
        return new ClasificacionSismoDTO(
                savedClasificacion.getKmProfundidadDesde(),
                savedClasificacion.getKmProfundidadHasta()
        );
    }

    public ClasificacionSismoDTO getClasificacionSismoById(Long id) {
        ClasificacionSismo clasificacionSismo = clasificacionSismoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Clasificación de sismo no encontrada"));
        return new ClasificacionSismoDTO(
                clasificacionSismo.getKmProfundidadDesde(),
                clasificacionSismo.getKmProfundidadHasta()
        );
    }

    public void deleteClasificacionSismo(Long id) {
        if (!clasificacionSismoRepository.existsById(id)) {
            throw new RuntimeException("Clasificación de sismo no encontrada");
        }
        clasificacionSismoRepository.deleteById(id);
    }

    public List<ClasificacionSismoDTO> listClasificacionesSismo() {
        return clasificacionSismoRepository.findAll().stream()
                .map(c -> new ClasificacionSismoDTO(
                        c.getKmProfundidadDesde(),
                        c.getKmProfundidadHasta()
                )).toList();
    }
}
