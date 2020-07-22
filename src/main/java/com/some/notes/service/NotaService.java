package com.some.notes.service;

import com.some.notes.interfaces.INota;
import com.some.notes.interfacesService.INotaService;
import com.some.notes.model.Notas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService implements INotaService {

    @Autowired
    private INota data;

    @Override
    public List<Notas> listar() {
        return (List<Notas>) data.findAll();
    }

    @Override
    public Optional<Notas> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Notas n) {
        int res=0;
        Notas nota=data.save(n);
        if (!nota.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

}
