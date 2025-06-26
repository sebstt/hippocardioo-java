package com.example.hippocardioo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "formulario_diabetes")
@Data
public class FormularioDiabetes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer edad;
    private String correo;

    @Column(name = "tipo_diabetes")
    private String tipoDiabetes;
}
