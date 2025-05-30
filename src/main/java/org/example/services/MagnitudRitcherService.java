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

    /*
    public boolean esAutodetectado(MagnitudRitcher magnitud) {
            return magnitud != null && magnitud.esAutodetectado();
    }

     */
}
