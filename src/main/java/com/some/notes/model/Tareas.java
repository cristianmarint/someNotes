package com.some.notes.model;

import javax.persistence.*;

@Entity
@Table(name = "tarea")
public class Tareas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int user_id;
    private String titulo;
    private String texto;

    public Tareas(){

    }

    public Tareas(int id, int user_id, String titulo, String texto) {
        this.id = id;
        this.user_id = user_id;
        this.titulo = titulo;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
