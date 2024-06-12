package Examenes.SolucionSegundoParcial2024.pedidos;

import java.util.Set;

public class Plato extends Pedido {

    private String nombre;
    private Set<String> ingredientes;

    public Plato(double precio, String nombre, Set<String> ingredientes) {
        super(precio);
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String toString() {
        return "\n Plato: " + this.nombre + "\n Precio: " + this.getPrecio() + " euros.\n";
    }

    @Override
    public boolean tieneIngrediente(String ingrediente) {
        return this.ingredientes.contains(ingrediente);
    }

    @Override
    public boolean platoUnico() {
        return true;
    }
}
