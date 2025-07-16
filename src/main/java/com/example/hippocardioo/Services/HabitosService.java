package com.example.hippocardioo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hippocardioo.Entity.Habitos;
import com.example.hippocardioo.Repository.HabitosRepository;
import com.example.hippocardioo.Services.DAO.idao;

@Service
public class HabitosService implements idao<Habitos, Long> {

    @Autowired
    private HabitosRepository habitosRepository;

    @Override
    public List<Habitos> getAll() {
        return habitosRepository.findAll();
    }

    @Override
    public Habitos getById(Long id) {
        Optional<Habitos> optional = habitosRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Habitos create(Habitos entity) {
        if (entity == null) return null;
        return habitosRepository.save(entity);
    }

    @Override
    public Habitos update(Habitos entity) {
        if (entity == null || entity.getIdHabitos() == null) return null;

        Optional<Habitos> optional = habitosRepository.findById(entity.getIdHabitos());
        if (optional.isPresent()) {
            Habitos habitoExistente = optional.get();
            habitoExistente.setNombreHabitos(entity.getNombreHabitos());
            habitoExistente.setDescripcion_habitos(entity.getDescripcionHabitos());
            habitoExistente.setTipoHabitos(entity.getTipoHabitos());
            return habitosRepository.save(habitoExistente);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (id == null) return;
        if (habitosRepository.existsById(id)) {
            habitosRepository.deleteById(id);
        }
    }

    public List<Habitos> buscarPorTipo(String tipo) {
        return habitosRepository.findByTipoHabitosIgnoreCase(tipo);
    }

    public List<Habitos> buscarPorNombre(String nombre) {
        return habitosRepository.findByNombreHabitosContainingIgnoreCase(nombre);
    }
}
