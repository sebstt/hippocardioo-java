package com.example.hippocardioo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gravedad")
public class Gravedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gravedad", nullable = false)
    private Long id_gravedad;

    @Column(name = "nombre_gravedad", nullable = false, length = 100)
    private String nombreGravedad;

    @Column(name = "descripcion_gravedad", nullable = false, length = 100)
    private String descripcion;


    public Long getId_gravedad() {
        return id_gravedad;
    }

    public void setId_gravedad(Long id_gravedad) {
        this.id_gravedad = id_gravedad;
    }

    public String getNombre_gravedad() {
        return nombreGravedad;
    }

    public void setNombre_gravedad(String nombre_gravedad) {
        this.nombreGravedad = nombre_gravedad;
    }

    public String getDescripcion_gravedad() {
        return descripcion;
    }

    public void setDescripcion_gravedad(String descripcion_gravedad) {
        this.descripcion = descripcion_gravedad;
    }
}
