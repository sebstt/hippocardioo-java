package com.example.hippocardioo.Controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Añadimos la anotación @Controller
public class DashboardController {

    @GetMapping("/admin/dashboard")
    public String getDashboard(
            @RequestParam(value = "nombre", required = false) String nombre,
            @RequestParam(value = "edad", required = false) Integer edad,
            @RequestParam(value = "tipo_diabetes", required = false) String tipoDiabetes,
            @RequestParam(value = "tipo_ets", required = false) String tipoEts,
            @RequestParam(value = "presion_arterial", required = false) String presionArterial,
            @RequestParam(value = "peso", required = false) Double peso,
            @RequestParam(value = "altura", required = false) Double altura,
            Model model) {

        // Agregar atributos al modelo
        model.addAttribute("nombre", nombre);
        model.addAttribute("edad", edad);
        model.addAttribute("tipo_diabetes", tipoDiabetes);
        model.addAttribute("tipo_ets", tipoEts);
        model.addAttribute("presion_arterial", presionArterial);
        model.addAttribute("peso", peso);
        model.addAttribute("altura", altura);

        // Métodos simulados para formularios
        model.addAttribute("formulariosDiabetes", obtenerFormulariosDiabetes());
        model.addAttribute("formulariosEts", obtenerFormulariosEts());
        model.addAttribute("formulariosHipertension", obtenerFormulariosHipertension());
        model.addAttribute("formulariosObesidad", obtenerFormulariosObesidad());

        return "admin/dashboard"; // Debería corresponder al archivo: templates/dashboard.html
    }

    // Métodos simulados para obtener formularios (aquí los puedes sustituir con datos reales)
    private List<Formulario> obtenerFormulariosDiabetes() {
        return List.of(new Formulario("Juan Pérez", "Tipo 1"));
    }

    private List<Formulario> obtenerFormulariosEts() {
        return List.of(new Formulario("María Gómez", "VIH"));
    }

    private List<Formulario> obtenerFormulariosHipertension() {
        return List.of(new Formulario("Carlos Rodríguez", "120/80", 75.0, 170.0));
    }

    private List<Formulario> obtenerFormulariosObesidad() {
        return List.of(new Formulario("Ana López", 85.0, 160.0));
    }

    // Clase Formulario (puedes personalizarla según tus necesidades)
    public static class Formulario {
        private String nombre;
        private String tipoDiabetes;
        private String tipoEts;
        private String presionArterial;
        private Double peso;
        private Double altura;

        // Constructor, getters y setters
        public Formulario(String nombre, String tipoDiabetes) {
            this.nombre = nombre;
            this.tipoDiabetes = tipoDiabetes;
        }

        public Formulario(String nombre, String presionArterial, Double peso, Double altura) {
            this.nombre = nombre;
            this.presionArterial = presionArterial;
            this.peso = peso;
            this.altura = altura;
        }

        public Formulario(String nombre, Double peso, Double altura) {
            this.nombre = nombre;
            this.peso = peso;
            this.altura = altura;
        }

        // Getters y setters
        public String getNombre() { return nombre; }
        public String getTipoDiabetes() { return tipoDiabetes; }
        public String getTipoEts() { return tipoEts; }
        public String getPresionArterial() { return presionArterial; }
        public Double getPeso() { return peso; }
        public Double getAltura() { return altura; }
    }
}
