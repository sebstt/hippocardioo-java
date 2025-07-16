package com.example.hippocardioo.Dto;

public class enfermedadesDTO {

    private Long id_enfermedades;
    private String nombre_enfermedades;
    private String descripcion_enfermedades;
    private String causas_enfermedades;
    private String cuidados_enfermedades;
    private String tiposEnfermedades;
    private String sintomas_enfermedades;

    public enfermedadesDTO(Long id_enfermedades, String nombre_enfermedades, String descripcion_enfermedades, String causas_enfermedades, String cuidados_enfermedades, String tiposEnfermedades, String sintomas_enfermedades) {
        this.id_enfermedades = id_enfermedades;
        this.nombre_enfermedades = nombre_enfermedades;
        this.descripcion_enfermedades = descripcion_enfermedades;
        this.causas_enfermedades = causas_enfermedades;
        this.cuidados_enfermedades = cuidados_enfermedades;
        this.tiposEnfermedades = tiposEnfermedades;
        this.sintomas_enfermedades = sintomas_enfermedades;
    }

    public Long getId_enfermedades() {
        return id_enfermedades;
    }

    public void setId_enfermedades(Long id_enfermedades) {
        this.id_enfermedades = id_enfermedades;
    }

    public String getNombre_enfermedades() {
        return nombre_enfermedades;
    }

    public void setNombre_enfermedades(String nombre_enfermedades) {
        this.nombre_enfermedades = nombre_enfermedades;
    }

    public String getDescripcion_enfermedades() {
        return descripcion_enfermedades;
    }

    public void setDescripcion_enfermedades(String descripcion_enfermedades) {
        this.descripcion_enfermedades = descripcion_enfermedades;
    }

    public String getCausas_enfermedades() {
        return causas_enfermedades;
    }

    public void setCausas_enfermedades(String causas_enfermedades) {
        this.causas_enfermedades = causas_enfermedades;
    }

    public String getCuidados_enfermedades() {
        return cuidados_enfermedades;
    }

    public void setCuidados_enfermedades(String cuidados_enfermedades) {
        this.cuidados_enfermedades = cuidados_enfermedades;
    }

    public String getTipos_enfermedades() {
        return tiposEnfermedades;
    }

    public void setTipos_enfermedades(String tiposEnfermedades) {
        this.tiposEnfermedades = tiposEnfermedades;
    }

    public String getSintomas_enfermedades() {
        return sintomas_enfermedades;
    }

    public void setSintomas_enfermedades(String sintomas_enfermedades) {
        this.sintomas_enfermedades = sintomas_enfermedades;
    }
}
