package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "alcancesismo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlcanceSismo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany
    @JoinColumn(name = "eventosismo")
    private List<EventoSismo>  eventoSismo;

}
