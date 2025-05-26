package org.example.services;

import org.example.dtos.EventoSismoCreateDTO;
import org.example.dtos.EventoSismoResponseDTO;
import org.example.entities.*;
import org.example.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoSismoService {

    // Repositorios
    private final EventoSismoRepository eventoSismoRepository;
    private final ClasificacionSismoRepository clasificacionSismoRepository;
    private final AlcanceSismoRepository alcanceSismoRepository;
    private final MagnitudRitcherRepository magnitudRitcherRepository;
    private final OrigenGeneracionRepository origenGeneracionRepository;

    // Constructor con inyección de dependencias
    public EventoSismoService(
            EventoSismoRepository eventoSismoRepository,
            ClasificacionSismoRepository clasificacionSismoRepository,
            AlcanceSismoRepository alcanceSismoRepository,
            MagnitudRitcherRepository magnitudRitcherRepository,
            OrigenGeneracionRepository origenGeneracionRepository
    ) {
        this.eventoSismoRepository = eventoSismoRepository;
        this.clasificacionSismoRepository = clasificacionSismoRepository;
        this.alcanceSismoRepository = alcanceSismoRepository;
        this.magnitudRitcherRepository = magnitudRitcherRepository;
        this.origenGeneracionRepository = origenGeneracionRepository;
    }

    // Listar todos los eventos sísmicos
    public List<EventoSismoResponseDTO> listarEventosSismos() {
        return eventoSismoRepository.findAll().stream()
                .map(e -> new EventoSismoResponseDTO(
                        e.getFechaHoraOcurrencia(),
                        e.getLatitudEpicentro(),
                        e.getLongitudEpicentro(),
                        e.getLatitudHipocentro(),
                        e.getLongitudHipocentro(),
                        e.getValorMagnitud()
                ))
                .toList();
    }

    // Crear un nuevo evento sísmico con relaciones
    public EventoSismoResponseDTO crearEventoSismo(EventoSismoCreateDTO dto) {
        EventoSismo eventoSismo = new EventoSismo();

        // Seteo de campos simples
        eventoSismo.setFechaHora(dto.getFechaHora());
        eventoSismo.setFechaHoraOcurrencia(dto.getFechaHoraOcurrencia());
        eventoSismo.setLatitudEpicentro(dto.getLatitudEpicentro());
        eventoSismo.setLongitudEpicentro(dto.getLongitudEpicentro());
        eventoSismo.setLatitudHipocentro(dto.getLatitudHipocentro());
        eventoSismo.setLongitudHipocentro(dto.getLongitudHipocentro());
        eventoSismo.setValorMagnitud(dto.getValorMagnitud());

        // Seteo de relaciones
        ClasificacionSismo clasificacion = clasificacionSismoRepository.findById(dto.getClasificacionSismoId())
                .orElseThrow(() -> new RuntimeException("Clasificación no encontrada"));
        eventoSismo.setClasificacionSismo(clasificacion);

        AlcanceSismo alcance = alcanceSismoRepository.findById(dto.getAlcanceSismoId())
                .orElseThrow(() -> new RuntimeException("Alcance no encontrado"));
        eventoSismo.setAlcanceSismo(alcance);

        MagnitudRitcher magnitud = magnitudRitcherRepository.findById(dto.getMagnitudRitcherId())
                .orElseThrow(() -> new RuntimeException("Magnitud Ritcher no encontrada"));
        eventoSismo.setMagnitudRitcher(magnitud);

        OrigenGeneracion origen = origenGeneracionRepository.findById(dto.getOrigenGeneracionId())
                .orElseThrow(() -> new RuntimeException("Origen de generación no encontrado"));
        eventoSismo.setOrigenGeneracion(origen);

        // Guardar en base de datos
        EventoSismo guardado = eventoSismoRepository.save(eventoSismo);

        // Retornar DTO de respuesta
        return new EventoSismoResponseDTO(
                guardado.getFechaHoraOcurrencia(),
                guardado.getLatitudEpicentro(),
                guardado.getLongitudEpicentro(),
                guardado.getLatitudHipocentro(),
                guardado.getLongitudHipocentro(),
                guardado.getValorMagnitud()
        );
    }
}
