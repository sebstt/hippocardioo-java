package com.example.hippocardioo.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "recordatorios")
public class Recordatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recordatorio", nullable = false)
    private Long id_recordatorio;

    @Column(name = "nombre_recordatorio", nullable = false, length = 100)
    private String nombre_recordatorio;

    @Column(name = "tipo_recordatorio", nullable = false, length = 100)
    private String tipo_recordatorio;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    // Getters y Setters

    public Long getId_recordatorio() {
        return id_recordatorio;
    }

    public void setId_recordatorio(Long id_recordatorio) {
        this.id_recordatorio = id_recordatorio;
    }

    public String getNombre_recordatorio() {
        return nombre_recordatorio;
    }

    public void setNombre_recordatorio(String nombre_recordatorio) {
        this.nombre_recordatorio = nombre_recordatorio;
    }

    public String getTipo_recordatorio() {
        return tipo_recordatorio;
    }

    public void setTipo_recordatorio(String tipo_recordatorio) {
        this.tipo_recordatorio = tipo_recordatorio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
