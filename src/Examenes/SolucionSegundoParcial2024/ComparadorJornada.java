package Examenes.SolucionSegundoParcial2024;

import java.util.Comparator;

public class ComparadorJornada implements Comparator<JornadaGastronomica> {

    @Override
    public int compare(JornadaGastronomica j1, JornadaGastronomica j2) {
        if (j1.getNumeroPedidos() < j2.getNumeroPedidos()) return 1;
        if (j1.getNumeroPedidos() > j2.getNumeroPedidos()) return -1;
        else return 0;
    }
}
