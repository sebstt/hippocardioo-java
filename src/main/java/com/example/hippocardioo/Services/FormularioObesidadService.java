package com.example.hippocardioo.Services;

import com.example.hippocardioo.Entity.FormularioObesidad;
import com.example.hippocardioo.Repository.FormularioObesidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormularioObesidadService {

    @Autowired
    private FormularioObesidadRepository repository;

    public List<FormularioObesidad> obtenerTodos() {
        return repository.findAll();
    }

    public FormularioObesidad guardar(FormularioObesidad formulario) {
        return repository.save(formulario);
    }

    public Optional<FormularioObesidad> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
