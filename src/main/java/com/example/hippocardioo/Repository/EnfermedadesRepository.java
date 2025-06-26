package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.Enfermedades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnfermedadesRepository extends JpaRepository<Enfermedades, Long> {

    List<Enfermedades> findByTipoIgnoreCase(String tipo);
    List<Enfermedades> findByNombreContainingIgnoreCase(String nombre);
    List<Enfermedades> findByTiposEnfermedadesIgnoreCase(String tipo);
    List<Enfermedades> findByNombreEnfermedadesContainingIgnoreCase(String nombre);
}
