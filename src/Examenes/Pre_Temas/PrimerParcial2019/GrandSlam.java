package Examenes.Pre_Temas.PrimerParcial2019;

public class GrandSlam extends Torneo{

    private final static int PUNTACION = 2000;

    public GrandSlam(String name, String location, Fecha fechaInicio, Fecha fechaFinal) {
        super(name, location, fechaInicio, fechaFinal);
    }

    @Override
    public String toString() {
        return "Jugando GranSlam con puntuación de "+ PUNTACION;
    }
}
