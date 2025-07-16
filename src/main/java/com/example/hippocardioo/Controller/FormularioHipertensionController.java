package com.example.hippocardioo.Controller;

import com.example.hippocardioo.Entity.FormularioHipertension;
import com.example.hippocardioo.Services.FormularioHipertensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hipertension")
public class FormularioHipertensionController {

    @Autowired
    private FormularioHipertensionService service;

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("formulario", new FormularioHipertension());
        return "formulario-hipertension";
    }

    @PostMapping("/guardar")
    public String guardarFormulario(@ModelAttribute("formulario") FormularioHipertension formulario) {
        service.guardar(formulario);
        return "redirect:/hipertension/lista";
    }

    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("formularios", service.obtenerTodos());
        return "lista-hipertension";
    }

    @GetMapping("/editar/{id}")
    public String editarFormulario(@PathVariable Long id, Model model) {
        var formulario = service.obtenerPorId(id).orElse(null);
        model.addAttribute("formulario", formulario);
        return "formulario-hipertension";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarFormulario(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/hipertension/lista";
    }
}

