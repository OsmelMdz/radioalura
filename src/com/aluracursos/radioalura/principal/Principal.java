package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");
        miCancion.setAlbum("Hot in the Shade");
        miCancion.setGenero("Rock");

        for (int i = 0; i < 15000; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 200; i++) {
            miCancion.reproduce();
        }
        Podcasts miPodcast = new Podcasts();
        miPodcast.setTitulo("Cafe.Tech");
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setDescripcion("Charlas tech relajadas con sabor a café");

        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 800; i++) {
            miPodcast.reproduce();
        }
        System.out.println("\nBienvenido a Radio Alura");
        System.out.println(miCancion);
        System.out.println(miPodcast);

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.adicione(miCancion);
        misFavoritos.adicione(miPodcast);
    }
}
