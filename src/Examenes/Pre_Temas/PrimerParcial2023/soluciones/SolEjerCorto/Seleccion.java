package Examenes.Pre_Temas.PrimerParcial2023.soluciones.SolEjerCorto;

public class Seleccion {
    private static final int NUM_JUGADORES_SELECCION = 16;

    private JugadorSeleccion[] jugadores;
    private int numeroJugadores;

    public Seleccion() {
        this.jugadores = new JugadorSeleccion[Seleccion.NUM_JUGADORES_SELECCION];
        this.numeroJugadores = 0;
    }

    public void añadirLista(JugadorSeleccion jugador) {
        if (!this.listaCompleta()) {
            this.jugadores[this.numeroJugadores++] = jugador;
        }
    }

    public boolean listaCompleta() {
        return this.numeroJugadores == this.jugadores.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de convocados a la selección española: \n");
        for (JugadorSeleccion jugador : this.jugadores) {
            if (jugador != null) {
                sb.append(jugador + "\n");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Seleccion s = new Seleccion();
        s.añadirLista(new JugadorSeleccion("Rudy Fernández", 5, Equipo.REAL_MADRID, Posicion.ALERO));
        s.añadirLista(new JugadorSeleccion("Alberto Díaz", 9, Equipo.UNICAJA, Posicion.BASE));
        s.añadirLista(new JugadorSeleccion("Jaime Pradilla", 15, Equipo.VALENCIA, Posicion.ALA_PIVOT));
        System.out.println(s);
    }
}
