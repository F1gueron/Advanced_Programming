package Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios;

import Examenes.Post_Temas.Enero_2023.CodigoSolucion.tiposeventos.TipoEvento;

public class NaveChic extends EspacioEventos {

    public NaveChic(int metrosCuadrados, String direccion, String nombre, int capacidad, int year) {
        super(metrosCuadrados, direccion, nombre, capacidad, year);
    }

    @Override
    protected void calcularCoste() {
        this.setCoste(3000);
    }

    public boolean puedeCelebrar(TipoEvento tipoEvento) {
        boolean result = false;
        if (tipoEvento.equals(TipoEvento.EVENTO_CORPORATIVO) ||
                tipoEvento.equals(TipoEvento.CELEBRACION_FAMILIAR) ||
                tipoEvento.equals(TipoEvento.FIESTA_EMPRESA) ||
                tipoEvento.equals(TipoEvento.BODA))
            result = true;

        return result;
    }

    @Override
    public String toString() {
        return "NaveChic -- "+ super.toString();
    }
}
