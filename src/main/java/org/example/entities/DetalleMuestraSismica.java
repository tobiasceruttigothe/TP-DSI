package org.example.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detallemuestrasismica")
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
    @JoinColumn(name = "muestrasismica")
    private MuestraSismica muestraSismica;

    @OneToOne
    @JoinColumn(name = "tipodedato")
    private TipoDeDato tipoDeDato;
}
