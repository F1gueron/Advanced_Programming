package Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios;

import Examenes.Post_Temas.Enero_2023.CodigoSolucion.tiposeventos.TipoEvento;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.utils.CalendarioAnual;

import java.util.Objects;

public abstract class EspacioEventos implements Comparable<EspacioEventos> {

    private int metrosCuadrados;
    // la dirección incluye la población también
    private String direccion;
    private String nombre;
    // capacidad en número de personas
    private int capacidad;

    private double coste;

    private CalendarioAnual calendarioReservas;

    public EspacioEventos(int metrosCuadrados, String direccion, String nombre, int capacidad, int year) {
        this.metrosCuadrados = metrosCuadrados;
        this.direccion = direccion;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.calendarioReservas = new CalendarioAnual(year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EspacioEventos that = (EspacioEventos) o;
        return Objects.equals(nombre, that.nombre);
    }

    public int compareTo(EspacioEventos espacio) {
        if (this.metrosCuadrados < espacio.metrosCuadrados)
            return -1;
        else if (this.metrosCuadrados > espacio.metrosCuadrados)
            return 1;
        else
            return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    protected int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    protected abstract void calcularCoste();

    public abstract boolean puedeCelebrar(TipoEvento tipoEvento);

    protected void setCoste(double coste) {
        this.coste = coste;
    }

    public boolean tieneCapacidad(int numeroPersonas) {
        return this.capacidad >= numeroPersonas;
    }

    public boolean isReserved(String date) {
        return this.calendarioReservas.isReserved(date);
    }

    public void reservar(String date) {
        this.calendarioReservas.reserve(date);
    }

    public String getName() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "{ metrosCuadrados=" + metrosCuadrados +
                ", direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", coste=" + coste+"}";
    }

    public void borrarReserva(String date) {
        this.calendarioReservas.deleteReservation(date);
    }
}
