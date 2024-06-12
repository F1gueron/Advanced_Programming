package Examenes.SolucionSegundoParcial2024.pedidos.menus;

public class MenuLigero extends Menu {

    @Override
    protected int numMaximoPlatos() {
        return 2;
    }

    @Override
    public String toString() {
        return "Menú ligero:\n" + super.toString();
    }
}
