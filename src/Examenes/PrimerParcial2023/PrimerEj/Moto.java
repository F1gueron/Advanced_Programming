package Examenes.PrimerParcial2023.PrimerEj;

import Examenes.PrimerParcial2023.soluciones.SolEjerLargo.Fecha;

public abstract class Moto extends Carrera{

    private final static int NUM_MIN_VUELTAS = 60;

    public Moto(Fecha fecha) {
        super(fecha);
    }

    public boolean esValido(Circuito circuito){
        return circuito.numMinVueltas(NUM_MIN_VUELTAS);
    }
}
