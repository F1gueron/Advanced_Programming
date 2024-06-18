package Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios;

import Examenes.Post_Temas.Enero_2023.CodigoSolucion.tiposeventos.TipoEvento;

public class Loft extends EspacioEventos {
    public Loft(int metrosCuadrados, String direccion, String nombre, int capacidad, int year) {
        super(metrosCuadrados, direccion, nombre, capacidad, year);
    }

    @Override
    protected void calcularCoste() {
        double coste = 1000;
        if (this.getMetrosCuadrados() > 250)
            coste = coste + 300;
        this.setCoste(coste);
    }

    @Override
    public boolean puedeCelebrar(TipoEvento tipoEvento) {
        boolean result = false;
        if (tipoEvento.equals(TipoEvento.EVENTO_CORPORATIVO) ||
                tipoEvento.equals(TipoEvento.CELEBRACION_FAMILIAR))
            result = true;

        return result;
    }

    @Override
    public String toString() {
        return "Loft -- " + super.toString();
    }
}
