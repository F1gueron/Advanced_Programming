package Examenes.Post_Temas.Enero_2023.Propio.Espacios;

import Examenes.Post_Temas.Enero_2023.CodigoSolucion.utils.CalendarioAnual;
import Examenes.Post_Temas.Enero_2023.Propio.TiposEventos.TipoEvento;

import java.util.List;
import java.util.Objects;

public abstract class Espacio implements Comparable<Espacio> {
    private int M2;
    private String nombre;
    private int capacidad;
    private String direccion;
    private Double coste;
    private CalendarioAnual calendarioReservas;

    public Espacio(String nombre, int m2, int capacidad, String direccion, Double coste, List<TipoEvento> tipo) {
        this.M2 = m2;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.direccion = direccion;
        this.coste = coste;
        this.calendarioReservas = new CalendarioAnual(2024);
    }

    public int getM2() {
        return M2;
    }

    public void setM2(int m2) {
        M2 = m2;
    }

    public abstract boolean puedeCelebrar(TipoEvento tipoEvento);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Espacio espacio = (Espacio) o;
        return M2 == espacio.M2 && capacidad == espacio.capacidad && Objects.equals(nombre, espacio.nombre) && Objects.equals(direccion, espacio.direccion) && Objects.equals(coste, espacio.coste);
    }

    public int compareTo(Espacio espacio) {
        if (this.M2 < espacio.M2)
            return -1;
        else if (this.M2 > espacio.M2)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Espacio{" + this.nombre+
                "M2=" + M2 +
                ", capacidad=" + capacidad +
                ", direccion='" + direccion + '\'' +
                ", coste=" + coste +
                '}';
    }

    public boolean isReserved(String fecha) {
        return calendarioReservas.isReserved(fecha);
    }

    public boolean caben(int nPersonas) {
        return this.capacidad >= nPersonas;
    }

    public void reservar(String fecha) {
        this.calendarioReservas.reserve(fecha);
    }
}
