package com.some.notes.interfacesService;

import com.some.notes.model.Tarea;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ITareaService {
    public List<Tarea> listar();
    public Optional<Tarea> listarId(int id);
    public int save(Tarea t);
    public void delete(int id);
}
