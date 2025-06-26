package com.example.hippocardioo.Dto;

import java.time.LocalDateTime;

public class actividadesDTO {

    private Long id_actividades;
    private String nombre_actividades;
    private String descripcion_actividades;
    private String tipo_actividades;
    private LocalDateTime fecha_inicio;
    private LocalDateTime fecha_fin;

    public actividadesDTO(Long id_actividades, String nombre_actividades, String descripcion_actividades, String tipo_actividades, LocalDateTime fecha_inicio, LocalDateTime fecha_fin) {
        this.id_actividades = id_actividades;
        this.nombre_actividades = nombre_actividades;
        this.descripcion_actividades = descripcion_actividades;
        this.tipo_actividades = tipo_actividades;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

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
