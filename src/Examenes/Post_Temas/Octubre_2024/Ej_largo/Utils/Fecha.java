package Examenes.Post_Temas.Octubre_2024.Ej_largo.Utils;

public class Fecha {

    private int day;
    private int month;
    private int year;

    public Fecha(int dia, int mes, int año) {
        this.day = dia;
        this.month = mes;
        this.year = año;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return day == fecha.day && month == fecha.month && year == fecha.year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}

