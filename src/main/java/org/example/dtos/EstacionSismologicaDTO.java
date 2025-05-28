package org.example.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
public class EstacionSismologicaDTO {

    private Long idCodigoEstacion;
    private String documentoCertificado;
    private LocalDate fechaSolicitudCertificado;
    private double longitud;
    private double latitud;
    private String nombre;
    private long numeroCertificadoAdquisicion;
}
