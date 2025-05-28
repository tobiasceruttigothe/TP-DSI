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


    public EstacionSismologicaDTO createEstacionSismologica(EstacionSismologicaDTO estacionSismologicaDTO) {
        EstacionSismologica estacionSismologica = new EstacionSismologica();
        estacionSismologica.setIdCodigoEstacion(estacionSismologicaDTO.getIdCodigoEstacion());
        estacionSismologica.setDocumentoCertificado(estacionSismologicaDTO.getDocumentoCertificado());
        estacionSismologica.setFechaSolicitudCertificado(estacionSismologicaDTO.getFechaSolicitudCertificado());
        estacionSismologica.setLongitud(estacionSismologicaDTO.getLongitud());
        estacionSismologica.setLatitud(estacionSismologicaDTO.getLatitud());
        estacionSismologica.setNombre(estacionSismologicaDTO.getNombre());
        estacionSismologica.setNumeroCertificadoAdquisicion(estacionSismologicaDTO.getNumeroCertificadoAdquisicion());
        EstacionSismologica savedEstacion = estacionSismologicaRepository.save(estacionSismologica);
        return new EstacionSismologicaDTO(
                savedEstacion.getIdCodigoEstacion(),
                savedEstacion.getDocumentoCertificado(),
                savedEstacion.getFechaSolicitudCertificado(),
                savedEstacion.getLongitud(),
                savedEstacion.getLatitud(),
                savedEstacion.getNombre(),
                savedEstacion.getNumeroCertificadoAdquisicion()
        );
    }

    public EstacionSismologicaDTO getEstacionSismologicaById(Long id) {
        EstacionSismologica estacionSismologica = estacionSismologicaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estación sismológica no encontrada"));
        return new EstacionSismologicaDTO(
                estacionSismologica.getIdCodigoEstacion(),
                estacionSismologica.getDocumentoCertificado(),
                estacionSismologica.getFechaSolicitudCertificado(),
                estacionSismologica.getLongitud(),
                estacionSismologica.getLatitud(),
                estacionSismologica.getNombre(),
                estacionSismologica.getNumeroCertificadoAdquisicion()
        );
    }

    public void deleteEstacionSismologica(Long id) {
        if (!estacionSismologicaRepository.existsById(id)) {
            throw new RuntimeException("Estación sismológica no encontrada");
        }
        estacionSismologicaRepository.deleteById(id);
    }

    public List<EstacionSismologicaDTO> listEstacionesSismologicas() {
        return estacionSismologicaRepository.findAll().stream()
                .map(e -> new EstacionSismologicaDTO(
                        e.getIdCodigoEstacion(),
                        e.getDocumentoCertificado(),
                        e.getFechaSolicitudCertificado(),
                        e.getLongitud(),
                        e.getLatitud(),
                        e.getNombre(),
                        e.getNumeroCertificadoAdquisicion()
                )).toList();
    }
}
