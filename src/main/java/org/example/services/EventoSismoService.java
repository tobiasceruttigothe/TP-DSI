package org.example.services;

import org.example.dtos.EventoSismoResponseDTO;
import org.example.entities.*;
import org.example.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventoSismoService {



    // Repositorios
    private final EventoSismoRepository eventoSismoRepository;

    // Constructor con inyección de dependencias
    public EventoSismoService(
            EventoSismoRepository eventoSismoRepository
    ) {
        this.eventoSismoRepository = eventoSismoRepository;
    }
    public List<EventoSismoResponseDTO> buscarEventosAutodetectados() {
        List<EventoSismo> eventos = eventoSismoRepository.findAll();
        // Filtrar eventos no revisados y autodetectados, y mapear a DTO

    EventoSismo eventoSismo = new EventoSismo();

        List<EventoSismo> eventosOrdenados = eventoSismo.ordenarPorFechaYHoraOcurrencia(eventos);
        return eventosOrdenados.stream()
                .filter(evento -> evento.esNoRevisado()) // Llama a método en la entidad
                .filter(evento -> evento.getMagnitudRitcher().esAutodetectado())
                .map(e -> new EventoSismoResponseDTO(
                        e.getFechaHoraOcurrencia(),
                        e.getLatitudEpicentro(),
                        e.getLongitudEpicentro(),
                        e.getLatitudHipocentro(),
                        e.getLongitudHipocentro(),
                        e.getValorMagnitud()
                )).collect(Collectors.toList());
    }
}



