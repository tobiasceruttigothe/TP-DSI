package org.example.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_de_dato")
@Data

public class TipoDeDato {



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "nombre_unidad_medida")
    private String nombreUnidadMedida;

    @Column(name = "valor_umbral")
    private double valorUmbral;

    @OneToOne
    @JoinColumn(name = "detalle_muestra_sismica")
    private DetalleMuestraSismica detalleMuestraSismica;
}
