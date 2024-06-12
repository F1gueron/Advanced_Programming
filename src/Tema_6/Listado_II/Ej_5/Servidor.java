package Tema_6.Listado_II.Ej_5;

import java.util.PriorityQueue;
import java.util.Queue;

public class Servidor {
    private Queue<Peticion> peticiones = new PriorityQueue<>();

    private void procesar(){
        while (!peticiones.isEmpty()) {
            Peticion peticion = peticiones.poll(); // Obtén y remueve la primera petición de la cola
            peticion.procesar(); // Procesa la petición
        }
    }
}
