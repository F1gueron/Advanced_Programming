package Examenes.Post_Temas.Enero_2023.Propio.Espacios;

import Examenes.Post_Temas.Enero_2023.Propio.TiposEventos.TipoEvento;

import java.util.List;

public class NaveChic extends Espacio{

    public NaveChic(String nombre, int m2, int capacidad, String direccion, Double coste, List<TipoEvento> tipo) {
        super(nombre, m2, capacidad, direccion, coste, tipo);
    }

    @Override
    public boolean puedeCelebrar(TipoEvento tipoEvento) {
        return tipoEvento.equals(TipoEvento.EVENTO_CORPORATIVO) ||
               tipoEvento.equals(TipoEvento.CELEBRACION_FAMILIAR) ||
               tipoEvento.equals(TipoEvento.FIESTA_EMPRESA) ||
               tipoEvento.equals(TipoEvento.BODA);
    }
}

