package org.example.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TipoDeDatoDTO {

    private String denominacion;
    private String nombreUnidadMedida;
    private double valorUmbral;

}
