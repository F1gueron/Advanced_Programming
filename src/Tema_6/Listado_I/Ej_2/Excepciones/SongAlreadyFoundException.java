package Tema_6.Listado_I.Ej_2.Excepciones;

public class SongAlreadyFoundException extends Exception{
    public SongAlreadyFoundException() {
        super("Song already found");
    }
}
