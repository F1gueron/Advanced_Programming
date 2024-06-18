package Examenes.Post_Temas.Enero_2023.Propio.Exceptions;

public class InvalidDateException extends Exception{
    public InvalidDateException() {
        super("Formato fecha no válido");
    }
}
