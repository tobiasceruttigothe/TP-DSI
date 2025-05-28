package org.example.services;


import org.example.dtos.MagnitudRitcherDTO;
import org.example.entities.MagnitudRitcher;
import org.example.repository.MagnitudRitcherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagnitudRitcherService {

    public MagnitudRitcherService(MagnitudRitcherRepository magnitudRitcherRepository) {
        this.magnitudRitcherRepository = magnitudRitcherRepository;
    }

    private final MagnitudRitcherRepository magnitudRitcherRepository;

    public List<MagnitudRitcherDTO> listarMagnitudesRitcher() {
        return magnitudRitcherRepository.findAll().stream()
                .map(m -> new MagnitudRitcherDTO(
                        m.getDescripcionMagnitud(),
                        m.getNumero()
                )).toList();
    }
    /*
    public MagnitudRitcherDTO getMagnitudRitcherByAutoDetectado() {
        MagnitudRitcher magnitudRitcher = magnitudRitcherRepository.findByNumeroGreaterThan(4)
                .orElseThrow(() -> new RuntimeException("Magnitud Ritcher no encontrada: " ));
        return new MagnitudRitcherDTO(magnitudRitcher.getDescripcionMagnitud(), magnitudRitcher.getNumero());
    }

     */

    public MagnitudRitcherDTO crearMagnitudRitcher(MagnitudRitcherDTO magnitudRitcherDTO) {
        MagnitudRitcher magnitudRitcher = new MagnitudRitcher();
        magnitudRitcher.setDescripcionMagnitud(magnitudRitcherDTO.getDescripcionMagnitud());
        magnitudRitcher.setNumero(magnitudRitcherDTO.getNumero());
        // Aquí podrías agregar lógica adicional para guardar la magnitud en la base de datos
        MagnitudRitcher guardado = magnitudRitcherRepository.save(magnitudRitcher);

        return new MagnitudRitcherDTO(
                guardado.getDescripcionMagnitud(),
                guardado.getNumero()
        );
    }

    public void eliminarMagnitudRitcher(Long id) {
        if (!magnitudRitcherRepository.existsById(id)) {
            throw new RuntimeException("Magnitud Ritcher no encontrada");
        }
        magnitudRitcherRepository.deleteById(id);
    }
}
