package com.example.hippocardioo.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "actividades")
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actividades", nullable = false)
    private Long id_actividades;

    @Column(name = "nombre_actividades", nullable = false, length = 100)
    private String nombre_actividades;

    @Column(name = "descripcion_actividades", nullable = false, length = 100)
    private String descripcion_actividades;

    @Column(name = "tipo_actividades", nullable = false, length = 100)
    private String tipo_actividades;

    @Column(name = "fecha_inicio")
    private LocalDateTime fecha_inicio;

    @Column(name = "fecha_fin")
    private LocalDateTime fecha_fin;

    // ✅ Getters y Setters

    public Long getId_actividades() {
        return id_actividades;
    }

    public void setId_actividades(Long id_actividades) {
        this.id_actividades = id_actividades;
    }

    public String getNombre_actividades() {
        return nombre_actividades;
    }

    public void setNombre_actividades(String nombre_actividades) {
        this.nombre_actividades = nombre_actividades;
    }

    public String getDescripcion_actividades() {
        return descripcion_actividades;
    }

    public void setDescripcion_actividades(String descripcion_actividades) {
        this.descripcion_actividades = descripcion_actividades;
    }

    public String getTipo_actividades() {
        return tipo_actividades;
    }

    public void setTipo_actividades(String tipo_actividades) {
        this.tipo_actividades = tipo_actividades;
    }

    public LocalDateTime getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDateTime fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDateTime getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDateTime fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
