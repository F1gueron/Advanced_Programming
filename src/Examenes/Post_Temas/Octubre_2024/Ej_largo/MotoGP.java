package Examenes.Post_Temas.Octubre_2024.Ej_largo;

import Examenes.Post_Temas.Octubre_2024.Ej_largo.Utils.Fecha;

public class MotoGP extends Moto{
    private static final int MINIMO_NUM_VUELTAS = 60;


    public MotoGP(Fecha fecha) {
        super(fecha);
    }

    @Override
    public boolean valido(int numeroVueltas) {
        return numeroVueltas >= MINIMO_NUM_VUELTAS;
    }

    @Override
    public void mostrar() {
        System.out.println("MotoGP");
    }


}
