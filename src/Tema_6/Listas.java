package Tema_6;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void addElemToList(List<String> lista, String word){
        lista.add(word);
    }

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("elemento1");
        miLista.add("elemento2");
        miLista.add("elemento3");

        System.out.println(miLista);
        miLista.remove("elemento1");
        miLista.remove(1);
        System.out.println(miLista);
        Listas.addElemToList(miLista,"Hola");
        System.out.println(miLista);
        Listas.addElemToList(miLista,"Hola");
        System.out.println(miLista);

    }
}
