package com.example.hippocardioo.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "metas")
public class Metas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metas", nullable = false)
    private Long id_metas;

    @Column(name = "nombre_metas", nullable = false, length = 100)
    private String nombre_metas;

    @Column(name = "descripcion_metas", nullable = false, length = 100)
    private String descripcion_metas;

    @Column(name = "tipo_metas", nullable = false, length = 100)
    private String tipo_metas;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    // Getters y Setters

    public Long getId_metas() {
        return id_metas;
    }

    public void setId_metas(Long id_metas) {
        this.id_metas = id_metas;
    }

    public String getNombre_metas() {
        return nombre_metas;
    }

    public void setNombre_metas(String nombre_metas) {
        this.nombre_metas = nombre_metas;
    }

    public String getDescripcion_metas() {
        return descripcion_metas;
    }

    public void setDescripcion_metas(String descripcion_metas) {
        this.descripcion_metas = descripcion_metas;
    }

    public String getTipo_metas() {
        return tipo_metas;
    }

    public void setTipo_metas(String tipo_metas) {
        this.tipo_metas = tipo_metas;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
