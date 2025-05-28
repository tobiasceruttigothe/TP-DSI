package org.example.services;


import org.example.dtos.EstadoDTO;
import org.example.entities.Estado;
import org.example.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstadoService {

    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;

    }
    private final EstadoRepository estadoRepository;

    public List<EstadoDTO> listarEstados() {
        return estadoRepository.findAll().stream()
                .map(estado -> new EstadoDTO(estado.getNombre(), estado.getAmbito()))
                .collect(Collectors.toList());
    }

    public EstadoDTO getEstadoByNombre(String nombre) {
        Estado estado = estadoRepository.findByNombre(nombre)
                .orElseThrow(() -> new RuntimeException("Estado no encontrado: " + nombre));
        return new EstadoDTO(estado.getNombre(), estado.getAmbito());
    }

    public EstadoDTO crearEstado(EstadoDTO estadoDTO) {
        Estado estado = new Estado();
        estado.setNombre(estadoDTO.getNombre());
        estado.setAmbito(estadoDTO.getAmbito());
        // Aquí podrías agregar lógica adicional para guardar el estado en la base de datos
        Estado guardado = estadoRepository.save(estado);

        return new EstadoDTO(
                guardado.getNombre(),
                guardado.getAmbito()
        );
    }

    public void eliminarEstado(Long id) {
        if (!estadoRepository.existsById(id)) {
            throw new RuntimeException("Estado no encontrado");
        }
        estadoRepository.deleteById(id);
    }

    /*revisar
    public boolean esAmbitoEventoSismo(String ambito) {

        return "evento_sismo".equalsIgnoreCase(ambito);
    }
    */



}
