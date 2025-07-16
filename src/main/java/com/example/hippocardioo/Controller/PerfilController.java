package com.example.hippocardioo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerfilController {

    @GetMapping("/perfil")
    public String mostrarPerfil() {
        return "perfil";  // La vista perfil.html
    }
}
