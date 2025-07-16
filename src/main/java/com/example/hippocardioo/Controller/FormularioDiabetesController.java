package com.example.hippocardioo.Controller;

import com.example.hippocardioo.Entity.FormularioDiabetes;
import com.example.hippocardioo.Services.FormularioDiabetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/formulario")
public class FormularioDiabetesController {

    @Autowired
    private FormularioDiabetesService service;

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("formulario", new FormularioDiabetes());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarFormulario(@ModelAttribute("formulario") FormularioDiabetes formulario) {
        service.guardar(formulario);
        return "redirect:/formulario/lista";
    }

    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("formularios", service.obtenerTodos());
        return "lista";
    }

    @GetMapping("/editar/{id}")
    public String editarFormulario(@PathVariable Long id, Model model) {
        var opt = service.obtenerPorId(id);
        if (opt.isPresent()) {
            model.addAttribute("formulario", opt.get());
            return "formulario-diabetes";
        }
        return "redirect:/formulario/lista";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarFormulario(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/formulario/lista";
    }
}

