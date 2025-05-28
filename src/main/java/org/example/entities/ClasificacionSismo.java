package org.example.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "clasificacion_sismo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClasificacionSismo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "km_profundidad_hasta")
    private double kmProfundidadHasta;

    @Column(name = "km_profundidad_desde")
    private double kmProfundidadDesde;

    @OneToOne(mappedBy = "clasificacionSismo")
    @JoinColumn(name = "id_evento_sismo", referencedColumnName = "id")
    private EventoSismo idEventoSismo;


}
