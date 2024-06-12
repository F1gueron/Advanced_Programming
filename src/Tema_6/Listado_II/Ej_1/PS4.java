package Tema_6.Listado_II.Ej_1;

import java.util.ArrayList;
import java.util.Collections;

public class PS4 {
    private ArrayList<Juego> juegos = new ArrayList<>();

    public void añadir(Juego juego){
        this.juegos.add(juego);
    }

    public void mostrar(){
        Collections.sort(juegos);
        for (Juego juego : this.juegos){
            System.out.println(juego);
        }
    }
}
