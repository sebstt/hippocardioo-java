package com.example.hippocardioo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.hippocardioo.Entity.Usuario;
import com.example.hippocardioo.Services.UsuarioService;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/register")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "auth/register"; // archivo templates/register.html
    }

    @PostMapping("/register")
    public String procesarRegistro(@ModelAttribute("usuario") Usuario usuario,
                                    @RequestParam String password_confirmation,
                                    Model model) {

        if (!usuario.getPassword().equals(password_confirmation)) {
            model.addAttribute("error", "Las contraseñas no coinciden.");
            return "register";
        }

        if (usuarioService.emailExiste(usuario.getCorreo())) {
            model.addAttribute("error", "El correo ya está registrado.");
            return "register";
        }

        usuarioService.guardarUsuario(usuario);
        return "redirect:/login";
    }
}
