package Examenes.SolucionSegundoParcial2024;

import Examenes.SolucionSegundoParcial2024.exceptions.FechaInexistenteException;
import examenes.segundoparcialenero2024.utils.Fecha;

import java.util.*;
import java.util.stream.Stream;

public class GestorJornadasGastronomicas {

    // para mostrarlos ordenados por mayor número de pedidos
    private Set<JornadaGastronomica> jornadasOrdenadas;

    // Para que sea fácil obtenerlo por fecha se haría teniendo esta estructura
    private Map<Fecha, List<JornadaGastronomica>> jornadasFecha;

    public GestorJornadasGastronomicas() {
        this.jornadasOrdenadas = new TreeSet<>(new ComparadorJornada());
        this.jornadasFecha = new HashMap<>();
    }

    public void añadirJornada(JornadaGastronomica jornada) {
        this.jornadasOrdenadas.add(jornada);
        // Aun no se había añadido ninguna jornada en esta fecha
        if (this.jornadasFecha.get(jornada.getFecha()) == null) {
            this.jornadasFecha.put(jornada.getFecha(), new ArrayList<>());
        }
        this.jornadasFecha.get(jornada.getFecha()).add(jornada);
    }

    // Buscar por fecha y si no está entonces exception
    public List<JornadaGastronomica> jornadasEnFecha(Fecha fecha) throws FechaInexistenteException {
        if (this.jornadasFecha.get(fecha) != null) {
            return this.jornadasFecha.get(fecha);
        } else
            throw new FechaInexistenteException();

    }

    //  uno de streams para obtener las jornadas de una ciudad concreta
    public List<JornadaGastronomica> jornadasPorCiudad(String ciudad) {
        return this.jornadasOrdenadas.stream().filter(j -> j.mismaCiudad(ciudad)).toList();
    }

    public void mostrarPedidosPorIngrediente(String ingrediente) {
        for (JornadaGastronomica jg : this.jornadasOrdenadas) {
            System.out.println("** Jornada Gastronómica **");
            jg.mostrarPedidosPorIngrediente(ingrediente);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (JornadaGastronomica jg : this.jornadasOrdenadas) {
            sb.append(jg.toString() + "\n");
        }

        return sb.toString();
    }


}
