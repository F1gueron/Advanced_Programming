package Examenes.Post_Temas.Enero_2023.Propio;

import Examenes.Post_Temas.Enero_2023.Propio.Espacios.Espacio;
import Examenes.Post_Temas.Enero_2023.Propio.TiposEventos.TipoEvento;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Evento {
    private Set<Espacio> espacios;
    private int nPersonas;
    private Date fecha;
    private TipoEvento tipoEvento;

    public Evento(Set<Espacio> espacios) {
        this.espacios = new TreeSet<>();
    }


}
