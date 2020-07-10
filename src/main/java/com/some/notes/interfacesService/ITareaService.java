package com.some.notes.interfacesService;

import com.some.notes.model.Tareas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ITareaService {
    public List<Tareas> listar();
    public Optional<Tareas> listarId(int id);
    public int save(Tareas t);
    public void delete(int id);
}
