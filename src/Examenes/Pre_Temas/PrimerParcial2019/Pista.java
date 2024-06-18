package Examenes.Pre_Temas.PrimerParcial2019;

public enum Pista {
    PISTA_RAPIDA("Pista rápida"),HIERBA("Hierba"),TIERRA_BATIDA("Tierra batida");

    private String name;

    Pista(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
