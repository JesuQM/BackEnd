package com.BackEnd.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "equipo")
public class Equipo {
    @Id
    @Column(name = "ID_EQUIPO", nullable = false)
    private Integer id;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "VALOR_ESPERADO")
    private Integer valorEsperado;

    @Column(name = "VALOR_MAXIMO")
    private Integer valorMaximo;

    @Column(name = "VALOR_MINIMO")
    private Integer valorMinimo;

    @Column(name = "TIPO_EQUIPO", nullable = false)
    private Integer tipoEquipo;


}