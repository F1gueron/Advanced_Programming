package Examenes.PrimerParcial2019;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    public Fecha(int dia,int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    @Override
    public String toString() {
        return this.dia+"/"+this.mes+"/"+this.año;
    }

    public boolean enMes(int mes) {
        return this.mes == mes;
    }

    public boolean mesMayorQue(int mes) {
        return this.mes > mes;
    }

    public boolean mesMenorQue(int mes) {
        return this.mes < mes;
    }
}
