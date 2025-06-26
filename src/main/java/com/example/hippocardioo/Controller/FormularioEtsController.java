package com.example.hippocardioo.Controller;

import com.example.hippocardioo.Entity.FormularioEts; // crea esta entidad según los campos del formulario

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/formulario")
public class FormularioEtsController {

    @GetMapping("/ets")
    public String mostrarFormulario(Model model) {
        model.addAttribute("etsForm", new FormularioEts());
        return "ets";  // nombre del archivo HTML sin extensión, en templates/ets.html
    }

    @PostMapping("/ets")
    public String procesarFormulario(
            @ModelAttribute("etsForm") @Valid FormularioEts formularioEts,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "ets"; // si hay errores, vuelve a mostrar el formulario
        }

        // Aquí puedes guardar formularioEts en base de datos o hacer otras operaciones

        model.addAttribute("success", "Formulario enviado correctamente");
        model.addAttribute("etsForm", new FormularioEts()); // limpiar formulario
        return "ets";
    }
}
