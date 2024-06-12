package Tema_6.Listado_I.Ej_1.Excepciones;

public class TelefonoNotFoundException extends Exception{
    public TelefonoNotFoundException() {
        super("No existe el telofono indicado");
    }
}
