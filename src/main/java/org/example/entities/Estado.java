package org.example.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "estado")
@Data
public class Estado {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ambito")
    private String ambito;

    @OneToMany(mappedBy = "estado")
    private List<CambioEstado> cambiosEstado;
}
