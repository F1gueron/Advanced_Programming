package Examenes.PrimerParcial2023.PrimerEj;

import Examenes.PrimerParcial2023.soluciones.SolEjerLargo.Fecha;

public class Moto125cc extends Moto{
    public Moto125cc(Fecha fecha) {
        super(fecha);
    }

    @Override
    public void mostrar() {
        System.out.println("Carrera de 125cc");
    }
}
