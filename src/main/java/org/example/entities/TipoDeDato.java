package org.example.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipodedato")
@Data

public class TipoDeDato {



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "nombreunidadmedida")
    private String nombreUnidadMedida;

    @Column(name = "valorumbral")
    private double valorUmbral;

    @OneToOne
    @JoinColumn(name = "detallemuestrasismica")
    private DetalleMuestraSismica detalleMuestraSismica;
}
