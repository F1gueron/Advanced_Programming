package Examenes.Post_Temas.Octubre_2024.Ej_largo;

import Examenes.Post_Temas.Octubre_2024.Ej_largo.Utils.Fecha;

public abstract class Carrera {
    private Fecha fecha;

    public Carrera(Fecha fecha) {
        this.fecha = fecha;
    }

    public abstract boolean valido(int numeroVueltas);

    public abstract void mostrar();

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public boolean fechaOcupada(Fecha fecha) {
        return this.fecha.equals(fecha);
    }
}
