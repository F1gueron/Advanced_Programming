package Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios;

import Examenes.Post_Temas.Enero_2023.CodigoSolucion.tiposeventos.JuegoInfantil;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.tiposeventos.TipoEvento;

import java.util.ArrayList;
import java.util.List;

public class EspacioInfantil extends EspacioEventos {

    private int numeroNiñosCelebracion;
    private List<JuegoInfantil> juegos;

    public EspacioInfantil(int metrosCuadrados, String direccion, String nombre, int capacidad, int year, int numeroNiños) {
        super(metrosCuadrados, direccion, nombre, capacidad, year);
        this.numeroNiñosCelebracion = numeroNiños;
        this.juegos = new ArrayList<>();
        this.calcularCoste();
    }

    public EspacioInfantil(int metrosCuadrados, String direccion, String nombre, int capacidad, int year, int numeroNiños, List<JuegoInfantil> juegos) {
        super(metrosCuadrados, direccion, nombre, capacidad, year);
        this.numeroNiñosCelebracion = numeroNiños;
        this.juegos = juegos;
        this.calcularCoste();
    }


    @Override
    protected void calcularCoste() {
        // 90 euros de base
        double coste = 90;

        if (this.numeroNiñosCelebracion > 15) coste = coste + 40;

        if (this.juegos.size() > 2) coste = coste + 50;

        this.setCoste(coste);
    }

    @Override
    public boolean puedeCelebrar(TipoEvento tipoEvento) {
        boolean result = false;
        if (tipoEvento.equals(TipoEvento.FIESTA_INFANTIL))
            result = true;

        return result;
    }

    @Override
    public String toString() {
        return "Espacio Infantil -- "+ super.toString();
    }
}
