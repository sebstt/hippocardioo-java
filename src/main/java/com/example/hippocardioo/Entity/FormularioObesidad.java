package com.example.hippocardioo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "formularios_obesidad")
public class FormularioObesidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre es obligatorio")
    private String nombre;

    @NotNull(message = "La edad es obligatoria")
    private Integer edad;

    @Email(message = "Correo electrónico inválido")
    private String correo;

    @NotEmpty(message = "El IMC es obligatorio")
    @Pattern(regexp = "^[0-9]+(\\.[0-9]{1,2})?$", message = "IMC debe ser un número válido (Ej: 28.5)")
    private String imc;

    // Getters y Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getImc() { return imc; }
    public void setImc(String imc) { this.imc = imc; }
}
