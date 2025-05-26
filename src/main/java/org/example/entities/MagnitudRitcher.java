package org.example.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "magnitudritcher")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MagnitudRitcher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descripcionMagnitud")
    private String descripcionMagnitud;

    @Column(name = "numero")
    private double numero;

    @OneToMany(mappedBy = "magnitudRitcher")
    private List<EventoSismo> eventoSismo;

}
