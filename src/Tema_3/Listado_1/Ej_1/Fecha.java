package Tema_3.Listado_1.Ej_1;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return this.day == fecha.day && this.month == fecha.month && this.year == fecha.year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean posteriorA(Fecha comparar){
        if (comparar.year < this.year){
            return false;
        } else if (comparar.month < this.month) {
            return false;
        } else return comparar.day > this.day;
    }
}
