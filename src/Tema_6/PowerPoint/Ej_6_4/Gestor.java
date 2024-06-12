package Tema_6.PowerPoint.Ej_6_4;

import java.util.*;

public class Gestor{

    private Map<String,Set<Viaje>> viajesPorOrigen = new HashMap<>();
    private Map<String, Set<Viaje>> viajesPorDestino =  new HashMap<>();
    private List<Viaje> viajes = new ArrayList<>();
    private Set<String> ciudades = new HashSet<String>();


    public void addViaje(Viaje viaje){
        this.viajes.add(viaje);

        this.put(this.viajesPorOrigen,viaje.getOrigen(),viaje);
        this.put(this.viajesPorDestino,viaje.getDestino(),viaje);

        this.ciudades.add(viaje.getDestino());
        this.ciudades.add(viaje.getOrigen());
    }

    public void put(Map<String,Set<Viaje>> ciudadesViajes, String ciudad, Viaje viaje){

        /*Set<Viaje> viajes = ciudadesViajes.get(ciudad);
        if(viajes == null){
            viajes = new HashSet<>();
            ciudadesViajes.put(ciudad,viajes);
        }
        viajes.add(viaje);*/

        Set<Viaje> viajes = ciudadesViajes.computeIfAbsent(ciudad, k -> new HashSet<>());
        viajes.add(viaje);
    }

    public Collection<Viaje> viajesOrigen(String ciudad){
        return this.viajesPorOrigen.get(ciudad);
    }

    public Collection<Viaje> viajesDestino(String ciudad){
        return this.viajesPorDestino.get(ciudad);
    }

    public Collection<Viaje> viajes(){
        return this.viajes;
    }

    public Collection<String> devolverCiudades(){
        return this.ciudades;
    }
}
