package org.example.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class EventoSismoResponseDTO {

    private LocalDateTime fechaHoraOcurrencia;

    private Double latitudEpicentro;

    private Double longitudEpicentro;

    private Double latitudHipocentro;

    private Double longitudHipocentro;

    private Double valorMagnitud;

    // Constructor, getters y setters generados por Lombok
}
