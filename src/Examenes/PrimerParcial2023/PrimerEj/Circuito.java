package Examenes.PrimerParcial2023.PrimerEj;

import Examenes.PrimerParcial2023.soluciones.SolEjerLargo.Fecha;

public class Circuito {

    private static final int NUM_MAX_CARRERAS = 50;
    private String nombre;
    private int numVueltas;
    private double distancia;
    private Carrera[] carreras;
    private int numCarreras;

    public Circuito(String nombre, int numVueltas, double distancia) {
        this.nombre = nombre;
        this.numVueltas = numVueltas;
        this.distancia = distancia;
        this.carreras = new Carrera[NUM_MAX_CARRERAS];
    }


    public boolean puedeAlbergar(Carrera carrera){
        return carrera.esValido(this) && this.fechaLibre(carrera.getFecha()) && this.numCarreras < NUM_MAX_CARRERAS;
    }

    private boolean fechaLibre(Fecha fecha){
        for(Carrera c : carreras){
            if (fecha == c.getFecha()){
                return false;
            }
        }
        return true;
    }

    public void mostrar(){
        System.out.println("--- DATOS DEL CIRCUITO ---");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Numero de vueltas: "+this.numVueltas);
        System.out.println("Distancia: "+this.distancia);
        System.out.println("----- CARRERAS -----");
        for (Carrera c : carreras){
            c.mostrar();
        }
    }

    public void añadirCarrera(Carrera carrera) {
        this.carreras[numCarreras++] = carrera;
    }

    public boolean numMinVueltas(int numVueltas){
        return this.numVueltas >= numVueltas;
    }
}
