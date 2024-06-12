package Tema_6.PowerPoint.Ej_6_3;

public class Aeropuerto {
    private String name;
    private String location;
    private int capacidad;
    private int numPistas;

    public Aeropuerto(String word) {
        this.name = word;
    }

    public Aeropuerto(String nombre, String ciudad, int capacidad, int numPistas) {
        this.name = nombre;
        this.location = ciudad;
        this.capacidad = capacidad;
        this.numPistas = numPistas;
    }

    public String getNombre() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Aeropuerto [nombre=" + this.name + ", ciudad=" + this.location
                + ", capacidad=" + this.capacidad + ", numPistas=" + this.numPistas + "]";
    }
}
