package org.example.repository;

import org.example.entities.MagnitudRitcher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MagnitudRitcherRepository extends JpaRepository<MagnitudRitcher, Long> {

    Optional<List<MagnitudRitcher>> findByNumeroGreaterThan(double numero);

}
