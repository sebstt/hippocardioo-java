package com.example.hippocardioo.Services;

import com.example.hippocardioo.Entity.FormularioDiabetes;
import com.example.hippocardioo.Repository.FormularioDiabetesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormularioDiabetesService {

    @Autowired
    private FormularioDiabetesRepository repository;

    public List<FormularioDiabetes> obtenerTodos() {
        return repository.findAll();
    }

    public FormularioDiabetes guardar(FormularioDiabetes formulario) {
        return repository.save(formulario);
    }

    public Optional<FormularioDiabetes> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
