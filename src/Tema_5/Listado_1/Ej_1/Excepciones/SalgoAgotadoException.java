package Tema_5.Listado_1.Ej_1.Excepciones;

public class SalgoAgotadoException extends Exception{

    public SalgoAgotadoException() {
        super("No tienes más saldo para viajar");
    }
}
