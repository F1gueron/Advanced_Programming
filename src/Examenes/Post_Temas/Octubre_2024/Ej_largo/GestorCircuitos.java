package Examenes.Post_Temas.Octubre_2024.Ej_largo;

public class GestorCircuitos {

    private Circuito [] circuitos;
    private final int MAX_CIRCUITOS = 50;
    private int numCircuitos;

    public GestorCircuitos() {
        this.circuitos = new Circuito[this.MAX_CIRCUITOS];
        this.numCircuitos = 0;
    }

    public void addCircuito(Circuito circuito) {
        if (this.numCircuitos <this.circuitos.length) {
            this.circuitos[this.numCircuitos++] = circuito;
        }
    }

    public void mostrarCircuito(Carrera carrera){}

    public void actualizarCircuito(Carrera carrera){}

}


