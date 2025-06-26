package com.example.hippocardioo.Controller;

import com.example.hippocardioo.Entity.FormularioObesidad;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/formulario")
public class FormularioObesidadController {

    @GetMapping("/obesidad")
    public String mostrarFormulario(Model model) {
        model.addAttribute("obesidadForm", new FormularioObesidad());
        return "obesidad"; // Template en /resources/templates/obesidad.html
    }

    @PostMapping("/obesidad")
    public String procesarFormulario(
            @ModelAttribute("obesidadForm") @Valid FormularioObesidad formularioObesidad,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "obesidad";
        }

        // Aquí puedes guardar el formulario a la base de datos si es necesario

        model.addAttribute("success", "Formulario enviado correctamente");
        model.addAttribute("obesidadForm", new FormularioObesidad()); // Limpiar formulario
        return "obesidad";
    }
}
