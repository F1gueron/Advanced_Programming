package Examenes.SolucionSegundoParcial2024.pedidos;

import java.util.Objects;

public abstract class Pedido {
    private double precio;

    public Pedido(double precio) {
        this.precio = precio;
    }

    public abstract boolean tieneIngrediente(String ingrediente);

    public boolean platoUnico() {
        return false;
    }

    public double getPrecio() {
        return this.precio;
    }

    protected void incrementarPrecio(double precio) {
        this.precio = this.precio + precio;
    }
}
