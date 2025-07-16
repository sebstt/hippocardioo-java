package com.example.hippocardioo.Controller;

import com.example.hippocardioo.Entity.Habitos;
import com.example.hippocardioo.Services.HabitosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitos")
public class HabitosController {

    @Autowired
    private HabitosService habitosService;

    @GetMapping
    public ResponseEntity<List<Habitos>> getAll() {
        List<Habitos> list = habitosService.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Habitos> getById(@PathVariable Long id) {
        Habitos habito = habitosService.getById(id);
        return (habito != null) ? ResponseEntity.ok(habito) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Habitos> create(@RequestBody Habitos habito) {
        if (habito == null) {
            return ResponseEntity.badRequest().build();
        }
        Habitos creado = habitosService.create(habito);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Habitos> update(@PathVariable Long id, @RequestBody Habitos habito) {
        if (habito == null) {
            return ResponseEntity.badRequest().build();
        }
        habito.setIdHabitos(id);
        Habitos updated = habitosService.update(habito);
        return (updated != null) ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Habitos habito = habitosService.getById(id);
        if (habito != null) {
            habitosService.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/buscar/tipo")
    public ResponseEntity<List<Habitos>> buscarPorTipo(@RequestParam String tipo) {
        List<Habitos> list = habitosService.buscarPorTipo(tipo);
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }

    @GetMapping("/buscar/nombre")
    public ResponseEntity<List<Habitos>> buscarPorNombre(@RequestParam String nombre) {
        List<Habitos> list = habitosService.buscarPorNombre(nombre);
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }
}
