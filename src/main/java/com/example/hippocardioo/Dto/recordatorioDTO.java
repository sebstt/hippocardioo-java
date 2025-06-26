package com.example.hippocardioo.Dto;

import java.time.LocalDateTime;

public class recordatorioDTO {

    private Long id_recordatorio;
    private String nombre_recordatorio;
    private String tipo_recordatorio;
    private LocalDateTime fecha;

    public recordatorioDTO(Long id_recordatorio, String nombre_recordatorio, String tipo_recordatorio, LocalDateTime fecha) {
        this.id_recordatorio = id_recordatorio;
        this.nombre_recordatorio = nombre_recordatorio;
        this.tipo_recordatorio = tipo_recordatorio;
        this.fecha = fecha;
    }

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
