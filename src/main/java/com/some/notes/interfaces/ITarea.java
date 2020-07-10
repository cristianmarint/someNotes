package com.some.notes.interfaces;

import com.some.notes.model.Tareas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarea extends CrudRepository<Tareas, Integer> {
}
