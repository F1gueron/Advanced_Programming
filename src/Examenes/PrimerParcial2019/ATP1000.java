package Examenes.PrimerParcial2019;

public class ATP1000 extends ATP{

    private final static int PUNTUACION = 1000;

    public ATP1000(String nombre, String lugar, Fecha fechaInicio, Fecha fechaFin) {
        super(nombre, lugar, fechaInicio, fechaFin);
    }

    @Override
    public String toString() {
        return "Torneo ATP1000 con puntuación: "+PUNTUACION;
    }
}
