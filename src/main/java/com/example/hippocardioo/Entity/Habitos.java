package com.example.hippocardioo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "habitos")
public class Habitos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habitos", nullable = false)
    private Long id_habitos;

    @Column(name = "nombre_habitos", nullable = false, length = 100)
    private String nombre_habitos;

    @Column(name = "descripcion_habitos", nullable = false, length = 100)
    private String descripcion_habitos;

    @Column(name = "tipo_habitos", nullable = false, length = 100)
    private String tipo_habitos;


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
