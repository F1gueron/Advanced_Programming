package Examenes.Post_Temas.Enero_2023.Propio.Espacios;

import Examenes.Post_Temas.Enero_2023.Propio.TiposEventos.TipoEvento;

import java.util.List;

public class CelebracionesInfantiles extends Espacio{

    public CelebracionesInfantiles(String nombre, int m2, int capacidad, String direccion, Double coste, List<TipoEvento> tipo) {
        super(nombre, m2, capacidad, direccion, coste, tipo);
    }

    @Override
    public boolean puedeCelebrar(TipoEvento evento) {
        return evento.equals(TipoEvento.FIESTA_INFANTIL);
    }

}
