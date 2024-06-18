package Examenes.Post_Temas.Octubre_2024.Ej_corto;

public enum Equipos {
    REAL_MADRID("Real madrid"),
    BARCELONA("Barcelona"),
    UNICAJA("Unicaja");
    private String name;

    Equipos(String name){
        this.name = name;
    }
    public String toString() {
        return this.name;
    }


}
