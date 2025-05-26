package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

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
    private Date fechaAdquisicion;

    @Column(name = "nro_serie")
    private String nroSerie;

    @OneToMany(mappedBy = "sismografo")
    private List<SerieTemporal> serieTemporal;

    @OneToOne
    @JoinColumn(name = "id_estacion_sismologica")
    private EstacionSismologica estacionSismologica;
}
