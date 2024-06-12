package Tema_6.Listado_II.Ej_4;

public class Jugador implements Comparable<Jugador> {
   private String nickname;
   private int numGanadas;

    public String getNickname() {
        return nickname;
    }

    public int getNumGanadas() {
        return numGanadas;
    }

    @Override
    public int compareTo(Jugador otro) {
        return otro.getNickname().compareTo(this.nickname);

    }

    public void ganada() {
        this.numGanadas++;
    }
}
