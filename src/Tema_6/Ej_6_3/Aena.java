package Tema_6.Ej_6_3;

import java.util.HashMap;
import java.util.Map;

public class Aena {
    public static void main(String[] args) {

        Map<String, Aeropuerto> aeropuertos = new HashMap<String, Aeropuerto>();

        Aena.addAeropuerto(aeropuertos, new Aeropuerto("Barajas", "Madrid", 10, 4));
        Aena.addAeropuerto(aeropuertos, new Aeropuerto("Prat", "Barcelona", 6, 5));
        Aena.addAeropuerto(aeropuertos, new Aeropuerto("Aeropuerto de Castellón", "Castellón", 0, 4));

        System.out.println("Número de aeropuertos: " +aeropuertos.size());
        for (Aeropuerto a : aeropuertos.values()) {
            System.out.println(a.getNombre());
        }
        Aeropuerto a = aeropuertos.get("Barajas");

        System.out.println(a);
    }

    public static void addAeropuerto(Map<String, Aeropuerto> aeropuertos, Aeropuerto aeropuerto){
        aeropuertos.put(aeropuerto.getNombre(), aeropuerto);
    }

}
