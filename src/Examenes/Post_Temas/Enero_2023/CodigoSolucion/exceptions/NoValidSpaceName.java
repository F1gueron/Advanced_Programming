package Examenes.Post_Temas.Enero_2023.CodigoSolucion.exceptions;

public class NoValidSpaceName extends Exception {
    public NoValidSpaceName() {
        super("No existe un espacio para eventos con ese nombre");
    }
}
