package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.Actividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ActividadesRepository extends JpaRepository<Actividades, Long> {

    // Buscar por tipo exacto
    List<Actividades> findByTipoActividades(String tipo_actividades);

    // Buscar por nombre que contenga una palabra (like %nombre%)
    List<Actividades> findByNombreActividadesContainingIgnoreCase(String nombre);

    // Buscar actividades que comiencen después de una fecha
    List<Actividades> findByFechaInicioAfter(LocalDateTime fecha);

    // Buscar actividades que terminen antes de una fecha
    List<Actividades> findByFechaFinBefore(LocalDateTime fecha);

    // Buscar actividades entre dos fechas
    List<Actividades> findByFechaInicioBetween(LocalDateTime desde, LocalDateTime hasta);
}
