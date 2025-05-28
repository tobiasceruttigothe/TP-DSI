package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "estacion_sismologica")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstacionSismologica {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estacion_sismologica")
    private Long idEstacionSismologica;

    @Column(name = "id_codigo_estacion")
    private Long idCodigoEstacion;

    @Column(name = "documento_certificado")
    private String documentoCertificado;

    @Column(name = "fecha_solicitud_certificado")
    private LocalDate fechaSolicitudCertificado;

    @Column(name = "longitud")
    private double longitud;

    @Column(name = "latitud")
    private double latitud;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "numero_certificado_adquisicion")
    private long numeroCertificadoAdquisicion;

    @OneToOne
    @JoinColumn(name = "id_sismografo")
    private Sismografo sismografo;
}
