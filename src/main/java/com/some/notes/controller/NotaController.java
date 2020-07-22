package com.some.notes.controller;

import com.some.notes.interfacesService.INotaService;
import com.some.notes.model.Notas;
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
public class NotaController {

    @Qualifier("notaService")
    @Autowired
    private INotaService service;

    @GetMapping("/notas")
    public String index(final Model model){
        final List<Notas> notas = service.listar();
        model.addAttribute("notas",notas);
        return "notas/index";
    }

    @PostMapping("/notas/save")
    public String save(@Validated Notas n, Model model){
        service.save(n);
        return "redirect:/notas";
    }

    @GetMapping("/notas/add")
    public String add(Model model){
        model.addAttribute("nota", new Notas());
        return "notas/form";
    }

    @GetMapping("/notas/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        Optional<Notas> nota = service.listarId(id);
        model.addAttribute("nota",nota);
        return "notas/form";
    }

    @GetMapping("/notas/delete/id")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/tareas";
    }
}
