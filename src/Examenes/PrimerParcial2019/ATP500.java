package Examenes.PrimerParcial2019;

public class ATP500 extends ATP{
    private final static int PUNTUACION = 500;

    public ATP500(String nombre, String lugar, Fecha fechaInicio, Fecha fechaFin) {
        super(nombre, lugar, fechaInicio, fechaFin);
    }

    @Override
    public String toString() {
        return "Torneo de ATP500 con puntuación: "+PUNTUACION;
    }
}
