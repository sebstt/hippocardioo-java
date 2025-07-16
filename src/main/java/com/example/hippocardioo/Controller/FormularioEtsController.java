package com.example.hippocardioo.Controller;

import com.example.hippocardioo.Entity.FormularioEts;
import com.example.hippocardioo.Services.FormularioEtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ets")
public class FormularioEtsController {

    @Autowired
    private FormularioEtsService service;

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("formulario", new FormularioEts());
        return "formulario-ets";
    }

    @PostMapping("/guardar")
    public String guardarFormulario(@ModelAttribute("formulario") FormularioEts formulario) {
        service.guardar(formulario);
        return "redirect:/ets/lista";
    }

    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("formularios", service.obtenerTodos());
        return "lista-ets";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        var formulario = service.obtenerPorId(id);
        if (formulario.isPresent()) {
            model.addAttribute("formulario", formulario.get());
            return "formulario-ets";
        }
        return "redirect:/ets/lista";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/ets/lista";
    }
}
