package org.example.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "estado")
@Data
//@AllArgsConstructor

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
    private List<CambioEstado> cambioEstado;
}
