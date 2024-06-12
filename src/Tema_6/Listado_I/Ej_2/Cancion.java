package Tema_6.Listado_I.Ej_2;

public class Cancion {
    private String name;
    private int duration;

    public Cancion(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getName() {
        return this.name;
    }
}
