package Examenes.Pre_Temas.PrimerParcial2019;

public abstract class Torneo {

    private String name;
    private String location;
    private Fecha fechaInicio;
    private Fecha fechaFinal;

    public Torneo(String name, String location, Fecha fechaInicio, Fecha fechaFinal) {
        this.name = name;
        this.location = location;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public String toString() {
        return "Nombre: " + this.name + ", Lugar: " + this.location + ", Fecha de inicio: " + this.fechaInicio + ", Fecha de fin: " + this.fechaFinal;
    }

    public boolean enMes(int mes) {
        return fechaFinal.enMes(mes) || fechaFinal.enMes(mes) || this.mesesIntermedios(mes);
    }

    private boolean mesesIntermedios(int mes) {
        return fechaFinal.mesMayorQue(mes) && fechaInicio.mesMenorQue(mes);
    }

    public boolean ubicacion(String lugar) {
        return lugar.equals(this.location);
    }
}
