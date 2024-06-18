package Examenes.Post_Temas.Octubre_2024.Ej_largo;

import Examenes.Post_Temas.Octubre_2024.Ej_largo.Utils.Fecha;

public abstract class Moto extends Carrera{

    public Moto(Fecha fecha) {
        super(fecha);
    }

    public boolean valido(int numeroVueltas) {
        return true;
    }
}
