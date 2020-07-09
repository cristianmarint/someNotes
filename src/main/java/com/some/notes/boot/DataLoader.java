package com.some.notes.boot;

import com.some.notes.model.Tarea;
import com.some.notes.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private TareaRepository tareaRepository;

    @Autowired
    public  void setTareaRepository(TareaRepository tareaRepository){
        this.tareaRepository=tareaRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        Tarea t1= new Tarea();
        t1.setTitulo("Super tarea 1");
        t1.setTexto("descripción de una tareas espectacularmente increible");
        tareaRepository.save(t1);

        Tarea t2= new Tarea();
        t2.setTitulo("Super tarea 2");
        t2.setTexto("descripción de una tareas espectacularmente increible");
        tareaRepository.save(t2);

        Tarea t3= new Tarea();
        t3.setTitulo("Super tarea 3");
        t3.setTexto("descripción de una tareas espectacularmente increible");
        tareaRepository.save(t3);
    }
}