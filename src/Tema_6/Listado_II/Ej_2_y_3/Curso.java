package Tema_6.Listado_II.Ej_2_y_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Curso {
    private Set<Estudiante> estudiantes = new HashSet<>();
    private Map<String,Estudiante> estudiantesMap = new HashMap<>();

    public void esCompañero(Estudiante compañero){
        if(this.estudiantes.contains(compañero)){
            System.out.println("Es compañero");
        }else{
            System.out.println("No es compañero");
        }
    }

    public void añadirCompañero(Estudiante compañero){
        this.estudiantes.add(compañero);
        this.estudiantesMap.put(compañero.getNombre(),compañero);
    }

    public void tieneExp(String name){
        System.out.println(this.estudiantesMap.get(name));
    }
}
