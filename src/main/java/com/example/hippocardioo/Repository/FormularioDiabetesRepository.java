package com.example.hippocardioo.Repository;

import com.example.hippocardioo.Entity.FormularioDiabetes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioDiabetesRepository extends JpaRepository<FormularioDiabetes, Long> {
}

