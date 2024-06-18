package Examenes.Post_Temas.Octubre_2024.Ej_largo;

import Examenes.Post_Temas.Octubre_2024.Ej_largo.Utils.Fecha;

import java.util.Arrays;

public class F1 extends Carrera{

    private String[] escuderias;

    private final static int NUM_MIN_VUELTAS = 50;

    public F1(Fecha fecha, String[] escuderias) {
        super(fecha);
        this.escuderias = escuderias;
    }

    @Override
    public boolean valido(int numeroVueltas) {
        return numeroVueltas >= NUM_MIN_VUELTAS;
    }

    @Override
    public void mostrar() {
        System.out.println(" **** Carrera de Fórmula 1 **** ");
        System.out.println("Escuderías participantes:");
        for (String e:this.escuderias)
            System.out.println(e);
        System.out.println(" ******************************* ");
    }
}
