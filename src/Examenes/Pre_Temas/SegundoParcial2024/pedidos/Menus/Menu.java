package Examenes.Pre_Temas.SegundoParcial2024.pedidos.Menus;

import Examenes.Pre_Temas.SegundoParcial2024.pedidos.Pedido;
import Examenes.Pre_Temas.SegundoParcial2024.pedidos.Plato;

import java.util.List;

public class Menu extends Pedido {

    private List<Plato> platos;

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    public int maximoPlatos(){
        return 3;
    }

    @Override
    public String toString() {
        return "platos=" + this.platos;
    }
}
