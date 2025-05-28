package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sismografo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sismografo {

    @Id
    @Column(name = "id_sismografo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_adquisicion")
    private LocalDate fechaAdquisicion;

    @Column(name = "nro_serie")
    private String nroSerie;

    @OneToMany(mappedBy = "sismografo")
    @Column(name = "serie_temporal")
    private List<SerieTemporal> serieTemporal;

    @OneToOne
    @JoinColumn(name = "id_estacion_sismologica")
    private EstacionSismologica estacionSismologica;
}
