package Examenes.SolucionSegundoParcial2024.pedidos.menus;



import Examenes.SolucionSegundoParcial2024.exceptions.MenuCompletoException;
import Examenes.SolucionSegundoParcial2024.pedidos.Pedido;
import Examenes.SolucionSegundoParcial2024.pedidos.Plato;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Pedido {

    private List<Plato> platos;

    public Menu() {
        super(0.0);
        this.platos = new ArrayList<>();
    }

    protected int numMaximoPlatos() {
        return 3;
    }

    public void añadirPlato(Plato plato) throws MenuCompletoException {
        if (this.platos.size() < this.numMaximoPlatos()) {
            this.platos.add(plato);
            // actualizar el precio
            this.incrementarPrecio(plato.getPrecio());
        }
        else
            throw new MenuCompletoException();
    }

    @Override
    public boolean tieneIngrediente(String ingrediente) {
        boolean loTiene = false;
        int i = 0;
        while (!loTiene && i < this.platos.size()) {
            loTiene = this.platos.get(i).tieneIngrediente(ingrediente);
            i++;
        }

        return loTiene;
    }

    @Override
    public String toString() {
        return "platos=" + platos;
    }
}
