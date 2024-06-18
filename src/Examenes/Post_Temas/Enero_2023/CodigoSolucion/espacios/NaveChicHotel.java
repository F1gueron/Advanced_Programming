package Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios;

public class NaveChicHotel extends NaveChic {

    private int numeroHabitaciones;

    public NaveChicHotel(int metrosCuadrados, String direccion, String nombre, int capacidad, int year, int numeroHabitaciones) {
        super(metrosCuadrados, direccion, nombre, capacidad, year);
        this.numeroHabitaciones = numeroHabitaciones;
    }

    @Override
    protected void calcularCoste() {
        this.setCoste(this.numeroHabitaciones * 100 + 3000);
    }

    @Override
    public String toString() {
        return "Hotel"+super.toString();
    }
}
