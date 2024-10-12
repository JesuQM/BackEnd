package com.BackEnd.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tipo_equipo")
public class TipoEquipo {
    @Id
    @Column(name = "TIPO", nullable = false)
    private Integer id;

    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;
}