package org.example.entities;


import jakarta.persistence.*;
import lombok.Data;

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

    public boolean esNoRevisado() {
        return "no revisado".equalsIgnoreCase(nombre);

    }

    public boolean esAmbitoEventoSismico() {
        return "EventoSismico".equalsIgnoreCase(ambito);
    }
}
