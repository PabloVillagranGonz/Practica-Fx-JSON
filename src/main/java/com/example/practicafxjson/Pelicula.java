package com.example.practicafxjson;

public class Pelicula {
    public int id;
    public String titulo;
    public String fecha;
    public String genero;
    public String director;

    public Pelicula(int id, String titulo, String fecha, String genero, String director) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.genero = genero;
        this.director = director;
    }

    public Pelicula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
