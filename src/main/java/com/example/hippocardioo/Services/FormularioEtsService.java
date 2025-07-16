package com.example.hippocardioo.Services;

import com.example.hippocardioo.Entity.FormularioEts;
import com.example.hippocardioo.Repository.FormularioEtsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormularioEtsService {

    @Autowired
    private FormularioEtsRepository repository;

    public List<FormularioEts> obtenerTodos() {
        return repository.findAll();
    }

    public FormularioEts guardar(FormularioEts formulario) {
        return repository.save(formulario);
    }

    public Optional<FormularioEts> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

