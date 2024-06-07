package Examenes.PrimerParcial2022;

public abstract class ProductoSeguridad {
    private double coste;
    private Fecha inicioContrato;
    private Fecha finContrato;

    public ProductoSeguridad(double coste, Fecha inicioContrato, Fecha finContrato) {
        this.coste = coste;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }

    protected void incrementarPrecio(int coste){
        this.coste += coste;
    }


    @Override
    public String toString() {
        return "Inicio del contrato: " + this.inicioContrato + "\nFin del contrato: " + this.finContrato + "\n" + this.descripcionCoste() + "\n"+this.coste;
    }

    protected abstract String descripcionCoste();

    public boolean inicioPosteriorA(Fecha fecha){
        return this.inicioContrato.after(fecha);
    }
}
