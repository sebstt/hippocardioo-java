package com.example.hippocardioo.Services;

import com.example.hippocardioo.Entity.FormularioHipertension;
import com.example.hippocardioo.Repository.FormularioHipertensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormularioHipertensionService {

    @Autowired
    private FormularioHipertensionRepository repository;

    public List<FormularioHipertension> obtenerTodos() {
        return repository.findAll();
    }

    public FormularioHipertension guardar(FormularioHipertension formulario) {
        return repository.save(formulario);
    }

    public Optional<FormularioHipertension> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
