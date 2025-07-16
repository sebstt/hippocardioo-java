package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Buscar un usuario por correo (email)
    Optional<Usuario> findByCorreo(String correo);

    // Buscar usuarios cuyo nombre contenga un texto, ignorando mayúsculas/minúsculas
    List<Usuario> findByNombreContainingIgnoreCase(String nombre);

    // Buscar usuarios por correo ignorando mayúsculas/minúsculas
    List<Usuario> findByCorreoIgnoreCase(String correo);
}
