package Examenes.SolucionSegundoParcial2024.exceptions;

public class FechaInexistenteException extends Exception {
    public FechaInexistenteException() {
        super("No hay ninguna jornada gastronómica en esta fecha.");
    }
}
