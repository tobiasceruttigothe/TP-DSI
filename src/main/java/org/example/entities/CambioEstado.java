package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "cambio_estado")
@Data
public class CambioEstado {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_hora_inicio")
    private LocalDateTime fechaHoraInicio;

    @Column(name = "fecha_hora_fin")
    private LocalDateTime fechaHoraFin;

    @ManyToOne
    @JoinColumn(name = "evento_sismo", nullable = false)
    private EventoSismo eventoSismo;

    @ManyToOne
    @JoinColumn(name = "estado_id", referencedColumnName = "id")
    private Estado estado;


    public boolean esEstadoActual() {
        return fechaHoraFin == null;
    }
    public boolean esNoRevisado() {
        return estado.esAmbitoEventoSismico() && estado.esNoRevisado();
    }
}
