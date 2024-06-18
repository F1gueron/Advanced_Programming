package Examenes.Post_Temas.Enero_2024;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu extends Pedido{

    private List<Plato> platos;

    private final static int NUM_MAX_PLATOS = 3;

    public Menu() {
        super(0.0);
        this.platos = new ArrayList<>();
    }

    public void añadirPlato(Plato p) throws DemasiadosPlatoException {
       if (this.platos.size() < NUM_MAX_PLATOS){
           this.platos.add(p);
           this.addPrecio(p.getPrecio());
       }else {
           throw new DemasiadosPlatoException();
       }
    }

    @Override
    public boolean tieneIngrediente(String ingrediente) {
        for (Plato p : this.platos){
            if(p.tieneIngrediente(ingrediente)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "platos=" + this.platos +
                '}';
    }

}
