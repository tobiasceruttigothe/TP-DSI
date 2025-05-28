package org.example.services;


import org.example.dtos.TipoDeDatoDTO;
import org.example.entities.TipoDeDato;
import org.example.repository.TipoDeDatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDeDatoService {


    private final TipoDeDatoRepository tipoDeDatoRepository;
    public TipoDeDatoService(TipoDeDatoRepository tipoDeDatoRepository) {
        this.tipoDeDatoRepository = tipoDeDatoRepository;
    }

    public TipoDeDatoDTO createTipoDeDato(TipoDeDatoDTO tipoDeDatoDTO) {
        TipoDeDato tipoDeDato = new TipoDeDato();
        tipoDeDato.setDenominacion(tipoDeDatoDTO.getDenominacion());
        tipoDeDato.setNombreUnidadMedida(tipoDeDatoDTO.getNombreUnidadMedida());
        tipoDeDato.setValorUmbral(tipoDeDatoDTO.getValorUmbral());
        TipoDeDato savedTipoDeDato = tipoDeDatoRepository.save(tipoDeDato);
        return new TipoDeDatoDTO(
                savedTipoDeDato.getDenominacion(),
                savedTipoDeDato.getNombreUnidadMedida(),
                savedTipoDeDato.getValorUmbral()
        );
    }

    public TipoDeDatoDTO getTipoDeDatoById(Long id) {
        TipoDeDato tipoDeDato = tipoDeDatoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tipo de dato no encontrado"));
        return new TipoDeDatoDTO(
                tipoDeDato.getDenominacion(),
                tipoDeDato.getNombreUnidadMedida(),
                tipoDeDato.getValorUmbral()
        );
    }

    public void deleteTipoDeDato(Long id) {
        if (!tipoDeDatoRepository.existsById(id)) {
            throw new RuntimeException("Tipo de dato no encontrado");
        }
        tipoDeDatoRepository.deleteById(id);
    }

    public List<TipoDeDatoDTO> listTiposDeDato() {
        return tipoDeDatoRepository.findAll().stream()
                .map(t -> new TipoDeDatoDTO(
                        t.getDenominacion(),
                        t.getNombreUnidadMedida(),
                        t.getValorUmbral()
                )).toList();
    }
}
