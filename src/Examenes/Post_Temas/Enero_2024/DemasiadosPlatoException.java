package Examenes.Post_Temas.Enero_2024;

public class DemasiadosPlatoException extends Throwable {
    public DemasiadosPlatoException() {
        super("No entran mas platos en este menu");
    }
}
