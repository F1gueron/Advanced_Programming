package Tema_6.Listado_I.Ej_2;

import Tema_6.Listado_I.Ej_2.Excepciones.SongAlreadyFoundException;

import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String name;
    private List<Cancion> canciones = new ArrayList<>();

    public Disco(String name) {
        this.name = name;
    }

    public void añadirCancion(Cancion cancion) throws SongAlreadyFoundException {
        if (this.canciones.contains(cancion)) {
            throw new SongAlreadyFoundException();
        } else {
            this.canciones.add(cancion);
        }
    }

    public int duracion() {
        int dur = 0;
        for (Cancion cancion : this.canciones) {
            dur += cancion.getDuration();
        }
        return dur;
    }

    public String findSong(int i) {
        return this.canciones.get(i).getName();
    }

    public void mostrarDisco() {
        for (Cancion cancion : this.canciones) {
            System.out.println(cancion);
        }
    }

}
