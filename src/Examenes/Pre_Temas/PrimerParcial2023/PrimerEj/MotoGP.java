package Examenes.Pre_Temas.PrimerParcial2023.PrimerEj;

import Examenes.Pre_Temas.PrimerParcial2023.soluciones.SolEjerLargo.Fecha;

public class MotoGP extends Moto{

    public MotoGP(Fecha fecha) {
        super(fecha);
    }

    @Override
    public void mostrar() {
        System.out.println("Carrera de MOTOGP");
    }
}
