package com.example.hippocardioo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "auth/login"; // Carga login.html desde templates
    }

    @PostMapping("/login")
    public String processLogin(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam(required = false) String remember,
            Model model) {
        // ⚠️ Aquí va la lógica de autenticación (temporal hasta usar Spring Security)
        if ("admin@hippo.com".equals(email) && "1234".equals(password)) {
            // Se puede guardar en sesión si deseas
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Correo o contraseña incorrectos");
            return "auth/login";
        }
    }
}
