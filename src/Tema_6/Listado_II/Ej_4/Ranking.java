package Tema_6.Listado_II.Ej_4;

import java.util.*;
import java.util.stream.Collectors;

public class Ranking {
    private Set<Jugador> jugadores =  new TreeSet<>();

    public void addGanada(Jugador jugador){
        jugador.ganada();
    }

    public void añadirJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }


    public void mostrar(){
        for (Jugador jugador : this.jugadores) {
            System.out.println(jugador);
        }
    }
}
