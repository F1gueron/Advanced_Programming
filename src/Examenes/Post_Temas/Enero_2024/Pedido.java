package Examenes.Post_Temas.Enero_2024;

public abstract class Pedido {
    private Double precio;

    public Pedido(Double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    protected void addPrecio(double precio) {
        this.precio += precio;
    }


    public abstract boolean tieneIngrediente(String ingrediente);
}
