package Examenes.PrimerParcial2023.PrimerEj;
import Examenes.PrimerParcial2023.soluciones.SolEjerLargo.Fecha;

public class GestorCircuitos {

    private Circuito[] circuitos;
    private final int MAX_CIRCUITOS = 50;
    private int numCircuitos;

    public GestorCircuitos() {
        this.circuitos = new Circuito[this.MAX_CIRCUITOS];
        this.numCircuitos = 0;
    }

    public void addCircuito(Circuito circuito){
        if(numCircuitos < MAX_CIRCUITOS){
            circuitos[numCircuitos++] = circuito;
        }
    }

    private Circuito valido(Carrera carrera) {
        for (Circuito c : circuitos){
            if (c != null && c.puedeAlbergar(carrera)){
                return c;
            }
        }
        return null;
    }

    public void mostrarCircuito(Carrera carrera){
        Circuito circuito = valido(carrera);
        if (circuito != null){
            circuito.mostrar();
        }else{
            System.out.println("No existe ninguna carrera de esas características");
        }
    }

    public void actualizarCircuito(Carrera carrera){
        Circuito circuito = this.valido(carrera);
        if (circuito != null){
            circuito.añadirCarrera(carrera);
        }else{
            System.out.println("No se puede añadir a ningún lado");
        }
    }


    public static void main(String[] args) {
        GestorCircuitos gestor = new GestorCircuitos();
        gestor.addCircuito(new Circuito("Imola", 62, 305.609));
        gestor.addCircuito(new Circuito("Albert Park", 58, 307.574));

        String [] escuderias = {"Ferrari","McLaren/Mercedes","Renault"};
        F1 f1 = new F1(new Fecha(12, 5, 2005), escuderias);
        gestor.mostrarCircuito(f1);
        //gestor.actualizarCircuito(f1);
        //gestor.mostrar();
        //gestor.mostrarCircuito(new F1(new Fecha(13, 5, 2005), escuderias));
    }

}
