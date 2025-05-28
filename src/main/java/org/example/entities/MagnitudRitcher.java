package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "magnitud_ritcher")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MagnitudRitcher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descripcion_magnitud")
    private String descripcionMagnitud;

    @Column(name = "numero")
    private double numero;

    @OneToMany(mappedBy = "magnitudRitcher")
    @Column(name = "evento_sismo")
    private List<EventoSismo> eventoSismo;

}
