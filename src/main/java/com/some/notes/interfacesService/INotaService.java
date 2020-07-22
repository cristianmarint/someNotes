package com.some.notes.interfacesService;

import com.some.notes.model.Notas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface INotaService {
    public List<Notas> listar();
    public Optional<Notas> listarId(int id);
    public int save(Notas n);
    public void delete(int id);
}
