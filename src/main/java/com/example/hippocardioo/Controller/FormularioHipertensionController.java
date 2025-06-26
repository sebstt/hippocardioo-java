package com.example.hippocardioo.Controller;

import com.example.hippocardioo.Entity.FormularioHipertension;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/formulario")
public class FormularioHipertensionController {

    @GetMapping("/hipertension")
    public String mostrarFormulario(Model model) {
        model.addAttribute("hipertensionForm", new FormularioHipertension());
        return "hipertension";  // nombre del archivo HTML en templates/hipertension.html
    }

    @PostMapping("/hipertension")
    public String procesarFormulario(
            @ModelAttribute("hipertensionForm") @Valid FormularioHipertension formularioHipertension,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "hipertension";
        }

        // Aquí guardas formularioHipertension a la base de datos o lógica

        model.addAttribute("success", "Formulario enviado correctamente");
        model.addAttribute("hipertensionForm", new FormularioHipertension()); // Limpiar formulario
        return "hipertension";
    }
}
