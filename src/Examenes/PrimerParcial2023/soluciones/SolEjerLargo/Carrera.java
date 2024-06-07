package Examenes.PrimerParcial2023.soluciones.SolEjerLargo;

public abstract class Carrera {

    private Fecha fecha;

    public Carrera(Fecha fecha) {
        this.fecha = fecha;
    }

    public abstract void mostrar();

    public abstract boolean esValido(Circuito circuito);

    public boolean mismaFecha(Fecha fecha) {
        return this.fecha.equals(fecha);
    }

    public Fecha getFecha() {return this.fecha;}
}
