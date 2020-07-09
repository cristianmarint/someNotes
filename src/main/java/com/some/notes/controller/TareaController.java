package com.some.notes.controller;

import com.some.notes.interfacesService.ITareaService;
import com.some.notes.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class TareaController {

    @Qualifier("tareaService")
    @Autowired
    private ITareaService service;

    @GetMapping("/tareas")
    public String index(final Model model){
        final List<Tarea> tareas = service.listar();
        model.addAttribute("tareas",tareas);
        return "tareas/index";
    }

    @GetMapping("/tareas/add")
    public String add(Model model){
        model.addAttribute("tarea", new Tarea());
        return "tareas/form";
    }

    @PostMapping("tareas/save")
    public String save(@Validated Tarea t, Model model){
        service.save(t);
        return "redirect:/tareas";
    }

    @GetMapping("/tareas/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        Optional<Tarea> tarea = service.listarId(id);
        model.addAttribute("tarea",tarea);
        return "tareas/form";
    }

    @GetMapping("/tareas/delete/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/tareas";
    }
}
