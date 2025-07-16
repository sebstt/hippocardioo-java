package com.example.hippocardioo.Dto;

import java.time.LocalDateTime;

public class actividadesDTO {

    private Long id_actividades;
    private String nombre;
    private String descripcion;
    private String tipo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public actividadesDTO(Long id_actividades, String nombre, String descripcion, String tipo, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.id_actividades = id_actividades;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getId_actividades() {
        return id_actividades;
    }

    public void setId_actividades(Long id_actividades) {
        this.id_actividades = id_actividades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
}
