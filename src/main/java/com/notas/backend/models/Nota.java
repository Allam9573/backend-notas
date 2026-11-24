package com.notas.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_notas")
@Data
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notaId;
    private String titulo;
    private String descripcion;
    private String categoria;

}
