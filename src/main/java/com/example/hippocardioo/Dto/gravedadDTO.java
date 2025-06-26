package com.example.hippocardioo.Dto;

public class gravedadDTO {
    
    private Long id_gravedad;
    private String nombre_gravedad;
    private String descripcion_gravedad;
    
    public gravedadDTO(Long id_gravedad, String nombre_gravedad, String descripcion_gravedad) {
        this.id_gravedad = id_gravedad;
        this.nombre_gravedad = nombre_gravedad;
        this.descripcion_gravedad = descripcion_gravedad;
    }
    
    public Long getId_gravedad() {
        return id_gravedad;
    }

    public void setId_gravedad(Long id_gravedad) {
        this.id_gravedad = id_gravedad; 
    }

    public String getNombre_gravedad() {
        return nombre_gravedad;
    }

    public void setNombre_gravedad(String nombre_gravedad) {
        this.nombre_gravedad = nombre_gravedad;
    }

    public String getDescripcion_gravedad() {
        return descripcion_gravedad;
    }

    public void setDescripcion_gravedad(String descripcion_gravedad) {
        this.descripcion_gravedad = descripcion_gravedad;
    }
}
