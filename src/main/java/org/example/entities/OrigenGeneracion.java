package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "origengeneracion")
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



}
