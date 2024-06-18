package Examenes.Post_Temas.Enero_2023.Propio;


import Examenes.Post_Temas.Enero_2023.Propio.Espacios.Espacio;
import Examenes.Post_Temas.Enero_2023.Propio.Exceptions.AlreadyBookedException;
import Examenes.Post_Temas.Enero_2023.Propio.Exceptions.InvalidDateException;
import Examenes.Post_Temas.Enero_2023.Propio.Exceptions.NoExistException;
import Examenes.Post_Temas.Enero_2023.Propio.TiposEventos.TipoEvento;
import Examenes.Post_Temas.Enero_2023.Propio.utils.Utils;

import java.util.*;

public class GestorEmpresa {
    private Map<TipoEvento, Set<Espacio>> eventoEspacioSet;
    private Map<String, Espacio> espacios;


    public GestorEmpresa(Map<Espacio, Set<TipoEvento>> espacioEventoSet) {
        this.eventoEspacioSet = new HashMap<>();
        this.espacios = new HashMap<>();
    }

    public void añadirEspacio(Espacio espacio){
        TipoEvento[] eventos = TipoEvento.values();
        for (TipoEvento evento : eventos) {
            if (espacio.puedeCelebrar(evento)) {
                if (this.eventoEspacioSet.get(evento) == null) {
                    this.eventoEspacioSet.put(evento, new TreeSet<>());
                }
                this.eventoEspacioSet.get(evento).add(espacio);
            }
        }
    }

    public void mostrarEspaciosSegunTipo(TipoEvento tipoEvento){
        System.out.println("Espacios disponibles para celebrar: " + tipoEvento);
        for (Espacio espacio : this.eventoEspacioSet.get(tipoEvento)) {
            System.out.println(espacio);
            System.out.println(("****************************"));
        }
    }

    public void mostrarEspacios(TipoEvento tipoEvento, int nPersonas, String fecha) throws InvalidDateException {
        if(!Utils.validDateFormat(fecha)){
            throw new InvalidDateException();
        }
        System.out.println("Espacios disponibles para celebrar: " + tipoEvento);
        for (Espacio espacio : this.eventoEspacioSet.get(tipoEvento)) {
            if(espacio.isReserved(fecha) && espacio.caben(nPersonas)){
                System.out.println(espacio);
            }
        }
    }

    public void reservar(String nombre, String fecha) throws InvalidDateException, NoExistException, AlreadyBookedException {
        if (!Utils.validDateFormat(fecha)){
            throw new InvalidDateException();
        }
        if(this.espacios.get(nombre) == null){
            throw new NoExistException();
        }else{
            if(this.espacios.get(nombre).isReserved(fecha)){
                throw new AlreadyBookedException();
            }
            this.espacios.get(nombre).reservar(fecha);
        }

    }

}
