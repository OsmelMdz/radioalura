package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio) {
        System.out.println("\nVerificando favoritos...");
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento!");
        } else {
            System.out.println(audio.getTitulo() + " también tiene su encanto.");
        }

        System.out.println("Detalles:");
        System.out.println(audio);
    }
}
