package com.example.hippocardioo.Dto;

public class habitosDTO {
    
    private Long id_habitos;
    private String nombre_habitos;
    private String descripcion_habitos;
    private String tipo_habitos;
    
    public habitosDTO(Long id_habitos, String nombre_habitos, String descripcion_habitos, String tipo_habitos) {
        this.id_habitos = id_habitos;
        this.nombre_habitos = nombre_habitos;
        this.descripcion_habitos = descripcion_habitos;
        this.tipo_habitos = tipo_habitos;
    }
    
    public Long getId_habitos() {
        return id_habitos;
    }

    public void setId_habitos(Long id_habitos) {
        this.id_habitos = id_habitos; 
    }

    public String getNombre_habitos() {
        return nombre_habitos;
    }

    public void setNombre_habitos(String nombre_habitos) {
        this.nombre_habitos = nombre_habitos;
    }

    public String getDescripcion_habitos() {
        return descripcion_habitos;
    }

    public void setDescripcion_habitos(String descripcion_habitos) {
        this.descripcion_habitos = descripcion_habitos;
    }

    public String getTipo_habitos() {
        return tipo_habitos;
    }

    public void setTipo_habitos(String tipo_habitos) {
        this.tipo_habitos = tipo_habitos;
    }
}
