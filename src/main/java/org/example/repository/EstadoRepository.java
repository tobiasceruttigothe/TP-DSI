package org.example.repository;

import org.example.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
   Optional <Estado> findByNombre(String nombre);

}
