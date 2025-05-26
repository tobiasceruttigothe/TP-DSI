package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "serie_temporal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SerieTemporal {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "condicion_alarma")
    private String condicionAlarma;

    @Column(name = "fecha_hora_registro")
    private LocalDateTime fechaHoraRegistro;

    @Column(name = "fecha_hora_inicio_muestras")
    private LocalDateTime fechaHoraInicioMuestras;

    @Column(name = "frecuencia_muestras")
    private String frecuenciaMuestras;

    @ManyToOne
    @JoinColumn(name = "id_evento_sismo")
    private EventoSismo eventoSismo;

    @ManyToOne
    @JoinColumn(name = "id_sismografo")
    private Sismografo sismografo;

    @OneToMany(mappedBy = "serieTemporal")
    private List<MuestraSismica> muestraSismica;

}
