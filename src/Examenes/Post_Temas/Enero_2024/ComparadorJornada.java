package Examenes.Post_Temas.Enero_2024;


import java.util.Comparator;

public class ComparadorJornada implements Comparator<JornadaGastronómica> {

    @Override
    public int compare(JornadaGastronómica j1, JornadaGastronómica j2) {
        return Integer.compare(j2.getNumeroPedidos(), j1.getNumeroPedidos());
    }
}
