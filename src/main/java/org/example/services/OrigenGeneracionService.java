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


    public OrigenGeneracionDTO createOrigenGeneracion(OrigenGeneracionDTO origenGeneracionDTO) {
        OrigenGeneracion origenGeneracion = new OrigenGeneracion();
        origenGeneracion.setNombre(origenGeneracionDTO.getNombre());
        origenGeneracion.setDescripcion(origenGeneracionDTO.getDescripcion());
        OrigenGeneracion savedOrigen = origenGeneracionRepository.save(origenGeneracion);
        return new OrigenGeneracionDTO(
                savedOrigen.getNombre(),
                savedOrigen.getDescripcion()
        );
    }

    public OrigenGeneracionDTO getOrigenGeneracionById(Long id) {
        OrigenGeneracion origenGeneracion = origenGeneracionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Origen de generación no encontrado"));
        return new OrigenGeneracionDTO(
                origenGeneracion.getNombre(),
                origenGeneracion.getDescripcion()
        );
    }

    public void deleteOrigenGeneracion(Long id) {
        if (!origenGeneracionRepository.existsById(id)) {
            throw new RuntimeException("Origen de generación no encontrado");
        }
        origenGeneracionRepository.deleteById(id);
    }

    public List<OrigenGeneracionDTO> listOrigenesGeneracion() {
        return origenGeneracionRepository.findAll().stream()
                .map(o -> new OrigenGeneracionDTO(
                        o.getNombre(),
                        o.getDescripcion()
                )).toList();
    }

}
