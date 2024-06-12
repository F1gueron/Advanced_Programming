package Tema_6.Listado_II.Ej_1;

public class Juego implements Comparable<Juego>{
    private String nombre;

    private String getNombre(){
        return this.nombre;
    }

    @Override
    public int compareTo(Juego otro){
        return this.nombre.compareTo(otro.getNombre());
    }
}
