package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
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

    @Column(name = "fecha_hora_fin")
    private LocalDateTime fechaHora;

    @Column(name = "fecha_hora_ocurrencia")
    private LocalDateTime fechaHoraOcurrencia;

    @Column(name = "latitud_epicentro")
    private Double latitudEpicentro;

    @Column(name = "longitud_epicentro")
    private Double longitudEpicentro;

    @Column(name = "latitud_hipocentro")
    private Double latitudHipocentro;

    @Column(name = "longitud_hipocentro")
    private Double longitudHipocentro;

    @Column(name = "valor_magnitud")
    private Double valorMagnitud;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_clasificacion_sismo", referencedColumnName = "id")
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

    @OneToMany(mappedBy = "eventoSismo", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "series_temporales")
    private List<SerieTemporal> seriesTemporales = new ArrayList<>();

    @OneToMany(mappedBy = "eventoSismo", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "cambios_estado")
    private List<CambioEstado> cambiosEstado = new ArrayList<>();

    public boolean esNoRevisado() {
        for (CambioEstado cambio : cambiosEstado) {
            if (cambio.esEstadoActual() && cambio.esNoRevisado()) {
                return true;
            }
        }
        return false;
    }
    public List<EventoSismo> ordenarPorFechaYHoraOcurrencia(List<EventoSismo> eventos) {
        eventos.sort((e1, e2) -> e1.getFechaHoraOcurrencia().compareTo(e2.getFechaHoraOcurrencia()));
        return eventos;
    }

}
