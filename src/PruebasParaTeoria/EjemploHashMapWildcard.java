package PruebasParaTeoria;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMapWildcard {
    public static void main(String[] args) {
        // Declarar un HashMap con un wildcard para los valores
        HashMap<Long, ?> miMapa = new HashMap<>();

        // Intentar agregar valores - esto NO compilará
        // miMapa.put(1L, "Este es un String");
        // miMapa.put(2L, 100);

        // Sin embargo, puedes leer valores de un HashMap con wildcard si ya tiene datos
        // Para ilustrarlo, primero llenamos un HashMap con valores de tipo Object
        HashMap<Long, Object> tempMapa = new HashMap<>();
        tempMapa.put(1L, "Este es un String");
        tempMapa.put(2L, 100);
        tempMapa.put(3L, 45.67);

        // Asignamos el HashMap a la variable con wildcard
        miMapa = tempMapa;

        // Ahora podemos leer del mapa
        imprimirMapa(miMapa);
    }

    // Método que usa wildcards
    public static void imprimirMapa(Map<Long, ?> mapa) {
        for (Long clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
        }
    }
}

