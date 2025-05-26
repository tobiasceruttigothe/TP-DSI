package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "evento_sismo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoSismo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fechahorafin")
    private LocalDateTime fechaHora;

    @Column(name = "fechahoraocurrencia")
    private LocalDateTime fechaHoraOcurrencia;

    @Column(name = "latitudepicentro")
    private Double latitudEpicentro;

    @Column(name = "longitudepicentro")
    private Double longitudEpicentro;

    @Column(name = "latitudhipocentro")
    private Double latitudHipocentro;

    @Column(name = "longitudhipocentro")
    private Double longitudHipocentro;

    @Column(name = "valorMagnitud")
    private Double valorMagnitud;

    @ManyToOne
    @JoinColumn(name = "id_clasificacionsismo")
    private ClasificacionSismo clasificacionSismo;

    @ManyToOne
    @JoinColumn(name = "id_alcance_sismo")
    private AlcanceSismo alcanceSismo;

    @ManyToOne
    @JoinColumn(name = "id_magnitud_ritcher")
    private MagnitudRitcher magnitudRitcher;

    @ManyToOne
    @JoinColumn(name = "id_origen_generacion")
    private OrigenGeneracion origenGeneracion;

    @OneToMany(mappedBy = "eventoSismo")
    private List<SerieTemporal> seriesTemporales;

}
