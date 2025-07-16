package com.example.hippocardioo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "auth/login"; // archivo: templates/login.html
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String email,
                                 @RequestParam String password,
                                 Model model,
                                 HttpSession session) {
        // Aquí puedes validar desde un servicio de autenticación
        if ("admin@example.com".equals(email) && "1234".equals(password)) {
            session.setAttribute("usuario", email);
            return "redirect:/admin/dashboard";
        } else {
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";
        }
    }

    @GetMapping("/recuperar-password")
    public String recuperarPassword() {
        return "auth/recuperar-password"; // crea recuperar-password.html
    }
}
