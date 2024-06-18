package Examenes.Post_Temas.Enero_2023.Propio.Exceptions;

public class NoExistException extends Exception{
    public NoExistException() {
        super("El espacio proporcionado no existe");
    }
}
