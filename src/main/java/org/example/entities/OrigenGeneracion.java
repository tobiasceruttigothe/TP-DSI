package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "origen_generacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrigenGeneracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "origenGeneracion", cascade = CascadeType.ALL)
    @Column(name = "evento_sismo")
    private List<EventoSismo> eventoSismo;




}