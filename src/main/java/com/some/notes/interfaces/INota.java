package com.some.notes.interfaces;

import com.some.notes.model.Notas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INota extends CrudRepository<Notas, Integer> {
}
