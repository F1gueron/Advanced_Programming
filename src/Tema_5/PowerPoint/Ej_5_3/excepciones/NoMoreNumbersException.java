package Tema_5.PowerPoint.Ej_5_3.excepciones;

public class NoMoreNumbersException extends Exception{

    public NoMoreNumbersException(int numeroMaximo) {
        super("Se ha superado el numero maximo:" +numeroMaximo);
    }
}
