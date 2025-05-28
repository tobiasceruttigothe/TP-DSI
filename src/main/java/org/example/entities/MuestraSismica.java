package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "muestra_sismica")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MuestraSismica {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fecha_hora_muestra")
    private LocalDateTime fechaHoraMuestra;

    @OneToMany(mappedBy = "muestraSismica")
    private List<DetalleMuestraSismica> detalleMuestraSismica;

    @ManyToOne
    @JoinColumn(name = "id_serie_temporal")
    private SerieTemporal serieTemporal;

}
