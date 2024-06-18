package Examenes.Pre_Temas.PrimerParcial2023.PrimerEj;

import Examenes.Pre_Temas.PrimerParcial2023.soluciones.SolEjerLargo.Fecha;

public class Moto250cc extends Moto{
    public Moto250cc(Fecha fecha) {
        super(fecha);
    }

    @Override
    public void mostrar() {
        System.out.println("Carrera de 125cc");
    }
}
