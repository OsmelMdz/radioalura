package com.aluracursos.radioalura.modelos;

public class Podcasts extends Audio {
    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() > 2000){
            return 9;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return "PODCAST " + getTitulo() +
                " | Presentador: " + presentador +
                " | Descripción: " + descripcion +
                " | Likes: " + getTotalDeMeGusta() +
                " | Reproducciones: " + getTotalDeReproducciones();
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
