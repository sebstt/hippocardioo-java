package com.example.hippocardioo.Controller;

import com.example.hippocardioo.Entity.FormularioObesidad;
import com.example.hippocardioo.Services.FormularioObesidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/obesidad")
public class FormularioObesidadController {

    @Autowired
    private FormularioObesidadService service;

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("formulario", new FormularioObesidad());
        return "formulario-obesidad";
    }

    @PostMapping("/guardar")
    public String guardarFormulario(@ModelAttribute("formulario") FormularioObesidad formulario) {
        service.guardar(formulario);
        return "redirect:/obesidad/lista";
    }

    @GetMapping("/lista")
    public String listarFormularios(Model model) {
        model.addAttribute("formularios", service.obtenerTodos());
        return "lista-obesidad";
    }

    @GetMapping("/editar/{id}")
    public String editarFormulario(@PathVariable Long id, Model model) {
        var formulario = service.obtenerPorId(id).orElse(null);
        model.addAttribute("formulario", formulario);
        return "formulario-obesidad";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarFormulario(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/obesidad/lista";
    }
}

