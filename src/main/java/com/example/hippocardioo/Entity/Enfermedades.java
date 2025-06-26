package com.example.hippocardioo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enfermedades")
public class Enfermedades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enfermedades", nullable = false)
    private Long id_enfermedades;

    @Column(name = "nombre_enfermedades", nullable = false, length = 100)
    private String nombre_enfermedades;

    @Column(name = "descripcion_enfermedades", nullable = false, length = 100)
    private String descripcion_enfermedades;

    @Column(name = "causas_enfermedades", nullable = false, length = 100)
    private String causas_enfermedades;

    @Column(name = "cuidados_enfermedades", nullable = false, length = 100)
    private String cuidados_enfermedades;

    @Column(name = "tipos_enfermedades", nullable = false, length = 100)
    private String tipos_enfermedades;

    @Column(name = "sintomas_enfermedades", nullable = false, length = 100)
    private String sintomas_enfermedades;

    // Getters y Setters

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
        return tipos_enfermedades;
    }

    public void setTipos_enfermedades(String tipos_enfermedades) {
        this.tipos_enfermedades = tipos_enfermedades;
    }

    public String getSintomas_enfermedades() {
        return sintomas_enfermedades;
    }

    public void setSintomas_enfermedades(String sintomas_enfermedades) {
        this.sintomas_enfermedades = sintomas_enfermedades;
    }
}
