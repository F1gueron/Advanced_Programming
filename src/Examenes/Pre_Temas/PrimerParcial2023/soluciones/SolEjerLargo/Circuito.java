package Examenes.Pre_Temas.PrimerParcial2023.soluciones.SolEjerLargo;

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


    private boolean ocupado(Fecha fecha) {
        boolean ocupado = false;
        int i = 0;
        while (!ocupado && i < this.numCarreras) {
            ocupado = this.carreras[i].mismaFecha(fecha);
            i++;
        }

        return ocupado;
    }

    public boolean puedeAlbergar(Carrera carrera) {
        return carrera.esValido(this) &&
                !this.ocupado(carrera.getFecha()) && this.numCarreras < this.MAX_CARRERAS;
    }


    public void aceptar(Carrera carrera) {
        if (this.numCarreras < this.MAX_CARRERAS)
            this.carreras[this.numCarreras++] = carrera;
    }

    public boolean incluye(int numeroVueltas) {
        return (this.numeroVueltas >= numeroVueltas);
    }

    public void mostrar() {
        System.out.println("--- DATOS DEL CIRCUITO ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Número de vueltas: " + this.numeroVueltas);
        System.out.println("Distancia: " + this.distancia);
        System.out.println("------ Carreras ------");
        for (Carrera c : this.carreras)
            if (c != null)
                c.mostrar();
    }


}
