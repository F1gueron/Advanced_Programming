package Examenes.Pre_Temas.SegundoParcial2024.pedidos;

import java.util.Set;

public class Plato extends Pedido{

    private int nombre;
    private Set<String> listaIngredientes;

    public Plato(int nombre, Set<String> listaIngredientes) {
        this.nombre = nombre;
        this.listaIngredientes = listaIngredientes;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Set<String> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(Set<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    @Override
    public String toString() {
        return "Plato:" + this.nombre + "\n";
    }
}
