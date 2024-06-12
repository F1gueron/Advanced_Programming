package Examenes.SolucionSegundoParcial2024.utils;

import java.util.Calendar;
import java.util.Objects;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fecha fecha)) return false;
        return dia == fecha.dia && mes == fecha.mes && año == fecha.año;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, año);
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" +
                this.año;
    }
}
