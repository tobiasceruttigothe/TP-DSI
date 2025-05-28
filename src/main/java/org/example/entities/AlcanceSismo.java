package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "alcance_sismo")
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

    @OneToMany(mappedBy = "alcanceSismo", cascade = CascadeType.ALL)
    @Column(name = "evento_sismo")
    private List<EventoSismo> eventoSismo;

}
