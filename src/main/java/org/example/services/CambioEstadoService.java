package org.example.services;


import org.example.entities.CambioEstado;
import org.example.entities.Estado;
import org.example.entities.EventoSismo;
import org.example.repository.CambioEstadoRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
class CambioEstadoService {

    private final CambioEstadoRepository cambioEstadoRepository;
    private final EstadoService estadoService;
    public CambioEstadoService(CambioEstadoRepository cambioEstadoRepository, EstadoService estadoService) {
        this.cambioEstadoRepository = cambioEstadoRepository;
        this.estadoService = estadoService;
    }

    /*
    public CambioEstado obtenerCambioActual(EventoSismo evento) {
        return evento.getCambiosEstado().stream()
                .filter(c -> c.getFechaHoraFin() == null)
                .findFirst()
                .orElse(null);
    }

    public boolean esNoRevisado(CambioEstado cambio) {
        Estado estado = cambio.getEstado();
        return estadoService.esAmbitoEventoSismico(estado)
                && estadoService.esNoRevisado(estado);
    }

     */
}

