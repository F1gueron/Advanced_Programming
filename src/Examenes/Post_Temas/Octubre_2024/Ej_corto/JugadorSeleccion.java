package Examenes.Post_Temas.Octubre_2024.Ej_corto;

public class JugadorSeleccion {
    private Equipos equipo;
    private Position position;
    private String nombre;
    private int dorsal;

    public JugadorSeleccion(Equipos equipo, Position position, String nombre, int dorsal) {
        this.equipo = equipo;
        this.position = position;
        this.nombre = nombre;
        this.dorsal = dorsal;
    }



    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.dorsal+" - "+this.nombre+" - "+this.position+" del " + this.equipo;
    }
}
