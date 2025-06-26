package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.Habitos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitosRepository extends JpaRepository<Habitos, Long> {

    List<Habitos> findByTipoIgnoreCase(String tipo);
    List<Habitos> findByNombreContainingIgnoreCase(String nombre);
    List<Habitos> findByTipoHabitosIgnoreCase(String tipo);
    List<Habitos> findByNombreHabitosContainingIgnoreCase(String nombre);
}
