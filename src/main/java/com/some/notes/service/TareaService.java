package com.some.notes.service;

import com.some.notes.interfaces.ITarea;
import com.some.notes.interfacesService.ITareaService;
import com.some.notes.model.Tareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService implements ITareaService {

    @Autowired
    private ITarea data;

    @Override
    public List<Tareas> listar() {
        return (List<Tareas>) data.findAll();
    }

    @Override
    public Optional<Tareas> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Tareas t) {
        int res=0;
        Tareas tarea=data.save(t);
        if (!tarea.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
