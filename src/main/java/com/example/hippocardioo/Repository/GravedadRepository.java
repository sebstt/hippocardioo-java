package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.Gravedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GravedadRepository extends JpaRepository<Gravedad, Long> {
    List<Gravedad> findByNivelIgnoreCase(String nivel);
    List<Gravedad> findByNombreGravedadIgnoreCase(String nombre);
}
