package Tema_6.Listado_II.Ej_5;

public class Peticion implements Comparable<Peticion>{
    private int numero;
    private String identificador;

    public Peticion(int numero) {
        this.numero = numero;
        this.identificador = "REQUEST_"+numero;
    }

    public void procesar() {
        System.out.println("Procesada con ID: "+this.identificador);
    }

    public int getNumero() {
        return this.numero;
    }

    @Override
    public int compareTo(Peticion otra) {
        return Integer.compare(this.numero,otra.getNumero());
    }
}
