package Examenes.Post_Temas.Enero_2023.Propio.Exceptions;

public class AlreadyBookedException extends Exception{
    public AlreadyBookedException() {
        super("El espacio ya ha sido reservado");
    }
}
