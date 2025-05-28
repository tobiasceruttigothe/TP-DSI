package org.example.services;


import org.example.dtos.AlcanceSismoDTO;
import org.example.entities.AlcanceSismo;
import org.example.repository.AlcanceSismoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlcanceSismoService {
    public AlcanceSismoService(AlcanceSismoRepository alcanceSismoRepository) {
        this.alcanceSismoRepository = alcanceSismoRepository;
    }

    AlcanceSismoRepository alcanceSismoRepository;


    public AlcanceSismoDTO crearAlcanceSismo(AlcanceSismoDTO alcanceSismoDTO) {
        AlcanceSismo alcanceSismo = new AlcanceSismo();
        alcanceSismo.setNombre(alcanceSismoDTO.getNombre());
        alcanceSismo.setDescripcion(alcanceSismoDTO.getDescripcion());
        // Aquí podrías agregar lógica adicional para guardar el alcanceSismo en la base de datos
        AlcanceSismo guardado = alcanceSismoRepository.save(alcanceSismo);

        return new AlcanceSismoDTO(
                guardado.getNombre(),
                guardado.getDescripcion()
        );
    }

    public AlcanceSismoDTO obtenerAlcanceSismoPorId(Long id) {
        AlcanceSismo alcanceSismo = alcanceSismoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alcance Sismo no encontrado"));

        return new AlcanceSismoDTO(
                alcanceSismo.getNombre(),
                alcanceSismo.getDescripcion()
        );
    }

    public void eliminarAlcanceSismo(Long id) {
        if (!alcanceSismoRepository.existsById(id)) {
            throw new RuntimeException("Alcance Sismo no encontrado");
        }
        alcanceSismoRepository.deleteById(id);
    }

    public List<AlcanceSismoDTO> listarAlcancesSismo() {
        return alcanceSismoRepository.findAll().stream()
                .map(a -> new AlcanceSismoDTO(a.getNombre(), a.getDescripcion()))
                .collect(Collectors.toList());
    }
}
