package Examenes.PrimerParcial2023.soluciones.SolEjerCorto;

public enum Equipo {
    REAL_MADRID("Real Madrid"), BARCELONA("Barça"), PALENCIA("Palencia"),
    GRAN_CANARIA("Gran Canaria"), VALENCIA("Valencia"), UNICAJA("Unicaja de Málaga");

    private String name;

    Equipo(String name) {
        this.name = name;
    }


    public String toString() {
        return this.name;
    }

}
