package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.FormularioEts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioEtsRepository extends JpaRepository<FormularioEts, Long> {
}

