package com.example.hippocardioo.Dto;

import java.time.LocalDateTime;

public class metasDTO {
    
    private Long id_metas;
    private String nombre_metas;
    private String descripcion_metas;
    private String tipo_metas;
    private LocalDateTime fecha;

    public metasDTO(Long id_metas, String nombre_metas, String descripcion_metas, String tipo_metas, LocalDateTime fecha) {
        this.id_metas = id_metas;
        this.nombre_metas = nombre_metas;
        this.descripcion_metas = descripcion_metas;
        this.tipo_metas = tipo_metas;
        this.fecha = fecha;
    }

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
