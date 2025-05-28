package org.example.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClasificacionSismoDTO {

    private double kmProfundidadDesde;
    private double kmProfundidadHasta;

}
