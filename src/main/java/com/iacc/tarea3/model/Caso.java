package com.iacc.tarea3.model;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@ToString
@Table(name = "caso")
public class Caso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroCaso")
    private Integer numeroCaso;

    @Column(name = "rutNumero", nullable = false)
    private String rutNumero;

    @Column(name = "rutDv", nullable = false)
    private String rutDv;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "correoElectronico", nullable = false)
    private String correoElectronico;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "descripcionCaso")
    private String descripcionCaso;

    @Column(name = "fechaInicioCaso", nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioCaso;

    @Column(name = "fechaCierreCaso")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fechaCierreCaso;

    @Enumerated(EnumType.STRING)
    @Column(name = "estadoCaso", nullable = false)
    private EstadoCaso estadoCaso;

    @Column(name = "descripcionSentencia")
    private String descripcionSentencia;
}

