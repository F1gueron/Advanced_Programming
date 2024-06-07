package Examenes.PrimerParcial2023.PrimerEj;

import Examenes.PrimerParcial2023.soluciones.SolEjerLargo.Fecha;

public abstract class Carrera {

    private Fecha fecha;
    private String location;

    public Carrera(Fecha fecha) {
        this.fecha = fecha;
    }


    public abstract void mostrar();

    public Fecha getFecha(){
        return this.fecha;
    }

    public abstract boolean esValido(Circuito circuito);
}
