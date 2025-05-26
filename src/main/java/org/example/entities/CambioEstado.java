package org.example.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "cambioestado")
@Data
public class CambioEstado {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fechahorainicio")
    private LocalDateTime fechaHoraInicio;

    @Column(name = "fechahorafin")
    private LocalDateTime fechaHoraFin;

    @ManyToOne
    @JoinColumn(name = "estado", nullable = false)
    private Estado estado;
}
