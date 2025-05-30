package org.example.repository;

import org.example.entities.CambioEstado;
import org.example.entities.EventoSismo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CambioEstadoRepository extends JpaRepository<CambioEstado, Long> {
    List<CambioEstado> findByEventoSismo(EventoSismo evento);
}
