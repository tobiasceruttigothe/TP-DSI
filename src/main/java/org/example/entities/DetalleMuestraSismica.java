package org.example.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalle_muestra_sismica")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleMuestraSismica {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "valor")
    private double valor;

    @ManyToOne
    @JoinColumn(name = "muestra_sismica")
    private MuestraSismica muestraSismica;

    @ManyToOne
    @JoinColumn(name = "tipo_de_dato")
    private TipoDeDato tipoDeDato;
}
