package Examenes.Pre_Temas.PrimerParcial2023.soluciones.SolEjerCorto;

public class JugadorSeleccion {
    private String name;
    private int dorsal;
    private Equipo equipo;
    private Posicion pos;

    public JugadorSeleccion(String name, int dorsal, Equipo equipo, Posicion pos) {
        this.name = name;
        this.dorsal = dorsal;
        this.equipo = equipo;
        this.pos = pos;
    }

    public String toString() {
        return this.dorsal + " - " + this.name + " - " + this.pos + " del " + this.equipo;
    }

}
