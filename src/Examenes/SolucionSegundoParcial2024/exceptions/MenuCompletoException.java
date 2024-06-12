package Examenes.SolucionSegundoParcial2024.exceptions;

public class MenuCompletoException extends Exception {

    public MenuCompletoException() {
        super("Menú completo, no se pueden añadir más platos.");
    }
}
