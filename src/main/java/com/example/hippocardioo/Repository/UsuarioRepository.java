package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Buscar un usuario por email (único)
    Optional<Usuario> findByEmail(String email);

    // Buscar usuarios cuyo nombre contenga un texto, ignorando mayúsculas/minúsculas
    List<Usuario> findByNombreContainingIgnoreCase(String nombre);
    List<Usuario> findByCorreoIgnoreCase(String correo);
}
