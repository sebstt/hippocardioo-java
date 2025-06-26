package com.example.hippocardioo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register"; // renderiza register.html
    }

    @PostMapping("/register")
    public String processRegister(
        @RequestParam String name,
        @RequestParam String lastname,
        @RequestParam String email,
        @RequestParam String password,
        @RequestParam String password_confirmation,
        Model model
    ) {
        // Validaciones básicas
        if (!password.equals(password_confirmation)) {
            model.addAttribute("error", "Las contraseñas no coinciden.");
            return "register";
        }

        // Simular guardado (normalmente iría a una base de datos o servicio)
        System.out.println("Registrado: " + name + " " + lastname + " - " + email);

        // Redirigir al login
        return "redirect:/login";
    }
}
