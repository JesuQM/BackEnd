package com.BackEnd.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "historial_equipo")
public class HistorialEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "EQUIPO")
    private Integer equipo;

    @Column(name = "FECHA_REGISTRO")
    private Date fechaRegistro;

    @Column(name = "TIPO_EQUIPO")
    private Integer tipoEquipo;

    @Column(name = "VALOR_MEDIDO")
    private Integer valorMedido;

    @Column(name = "DESCRIPCION")
    private String descripcion;

}