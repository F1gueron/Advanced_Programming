package Examenes.Pre_Temas.PrimerParcial2023.PrimerEj;

import Examenes.Pre_Temas.PrimerParcial2023.soluciones.SolEjerLargo.Fecha;

public class F1 extends Carrera{
    private String[] escuderias;
    private static final int MINIMO_NUM_VUELTAS = 55;
    private static final int MAX_ESCUDERIAS = 10;

    public F1(Fecha fecha, String [] escuderias) {
        super(fecha);
        this.escuderias = escuderias;
    }

    public void mostrar(){
        System.out.println("**** CARRERA DE FÓRMULA 1 ****");
        System.out.println("Escuderías participantes: ");
        for (String escuderia : escuderias){
            System.out.println(escuderia);
        }
    }

    @Override
    public boolean esValido(Circuito circuito) {
        return circuito.numMinVueltas(MINIMO_NUM_VUELTAS);
    }
}
