package com.some.notes.service;

import com.some.notes.interfaces.ITarea;
import com.some.notes.interfacesService.ITareaService;
import com.some.notes.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService implements ITareaService {

    @Autowired
    private ITarea data;

    @Override
    public List<Tarea> listar() {
        return (List<Tarea>) data.findAll();
    }

    @Override
    public Optional<Tarea> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Tarea t) {
        int respuesta=0;
        Tarea tarea=data.save(t);
        if (!tarea.equals(null)) respuesta = 1;
        return respuesta;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
