package org.example.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class EventoSismoCreateDTO {

    private LocalDateTime fechaHora;
    private LocalDateTime fechaHoraOcurrencia;
    private Double latitudEpicentro;
    private Double longitudEpicentro;
    private Double latitudHipocentro;
    private Double longitudHipocentro;
    private Double valorMagnitud;

    private Long clasificacionSismoId;
    private Long alcanceSismoId;
    private Long magnitudRitcherId;
    private Long origenGeneracionId;

    // Getters y setters (o podés usar Lombok @Data si preferís)
}
