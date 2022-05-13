package com.tacmo.tacmoprueba.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Carga")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Carga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Peso")
    private float peso;

    @Column(name = "TipoCarga")
    private byte tipoCarga;

    @Column(name = "Destino")
    private String destino;

    @Column(name = "Fecha")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY")
    private LocalDate fecha;

    @Column(name = "Estado")
    private boolean estado;

}
