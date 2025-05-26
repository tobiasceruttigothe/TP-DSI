package org.example.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "evento_sismo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClasificacionSismo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "kmprofundidadhasta")
    private double kmProfundidadHasta;

    @Column(name = "kmprofundidaddesde")
    private double kmProfundidadDesde;

    @OneToMany(mappedBy = "clasificacionSismo")
    private List<EventoSismo> eventoSismo;


}
