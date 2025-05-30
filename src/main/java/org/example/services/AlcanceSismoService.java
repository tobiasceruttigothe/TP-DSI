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

}
