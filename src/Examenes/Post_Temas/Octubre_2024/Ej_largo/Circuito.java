package Examenes.Post_Temas.Octubre_2024.Ej_largo;

import Examenes.Post_Temas.Octubre_2024.Ej_largo.Utils.Fecha;


public class Circuito {
    private final int MAX_CARRERAS = 50;
    private String nombre;

    private int numeroVueltas;

    private double distancia;

    private Carrera[] carreras;

    private int numCarreras;

    public Circuito(String nombre, int numeroVueltas, double distancia) {
        this.nombre = nombre;
        this.numeroVueltas = numeroVueltas;
        this.distancia = distancia;
        this.carreras = new Carrera[this.MAX_CARRERAS];
    }

    public boolean puedeAlbergar(Carrera carrera){
        return carrera.valido(this.numeroVueltas) && this.fechaDisponible(carrera.getFecha());
    }

    private boolean fechaDisponible(Fecha fecha) {
        for (Carrera carrera : carreras){
            if (carrera.fechaOcupada(fecha)){
                return false;
            }
        }
        return true;
    }

    public void mostrar(){
        System.out.println("--- DATOS DEL CIRCUITO ---");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Numero de vueltas: "+this.numeroVueltas);
        System.out.println("Distancia: "+this.distancia);
        System.out.println("------ Carreras ------");
        for (Carrera carrera : carreras){
            System.out.println(carrera);
        }
    }
}
