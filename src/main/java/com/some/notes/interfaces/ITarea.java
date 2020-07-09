package com.some.notes.interfaces;

import com.some.notes.model.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarea extends CrudRepository<Tarea, Integer> {
}
