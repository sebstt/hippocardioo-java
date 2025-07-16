package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.Habitos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitosRepository extends JpaRepository<Habitos, Long> {

    // Busca por tipoHabitos ignorando mayúsculas/minúsculas
    List<Habitos> findByTipoHabitosIgnoreCase(String tipo);

    // Busca por nombreHabitos que contenga el texto, ignorando mayúsculas/minúsculas
    List<Habitos> findByNombreHabitosContainingIgnoreCase(String nombre);

}

