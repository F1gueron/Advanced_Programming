package Examenes.Pre_Temas.PrimerParcial2019;

public class Calendario {
    private final int NUM_MAX_TORNEOS = 5;
    private int[] numTorneosMes;
    private Torneo[] torneos;
    private final int NUM_MESES = 12;
    private int numTorneos;


    public Calendario() {
        this.torneos = new Torneo[this.NUM_MESES];
        this.numTorneosMes = new int[this.NUM_MESES];
        this.numTorneos = 0;
    }

    public void addTorneo(Torneo torneo, int mes){
        if(this.mesDisponible(mes)){
            this.torneos[numTorneos++] = torneo;
        }
    }

    private boolean mesDisponible(int mes) {
        return numTorneosMes[mes] < 5;
    }

    private void mostrarMes(int mes){
        for (Torneo t : torneos){
            if(t != null && t.enMes(mes)){
                System.out.println(t);
            }
        }
    }

    private void mostrarLugar(String lugar){
        for (Torneo t : torneos){
            if(t != null && t.ubicacion(lugar)){
                System.out.println(t);
            }
        }
    }
}
