package Tema_3.Listado_1.Ej_1;

public class Cuenta {
    private int saldo;
    private int nCuenta;
    private Fecha fecha;

    public Cuenta(int saldo, int nCuenta, Fecha fecha) {
        this.saldo = saldo;
        this.nCuenta = nCuenta;
        this.fecha = fecha;
    }

    public boolean descubierta() {
        return saldo <= 0;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", nCuenta=" + nCuenta +
                ", fecha=" + fecha +
                '}';
    }

    public void abiertaPosteriorA(Fecha fecha) {
        if (this.fecha.posteriorA(fecha)){
            System.out.println("La cuenta " + this.nCuenta + " se abrió después de la fecha " + fecha);
        }
    }

    public int getNCuenta(){
        return this.nCuenta;
    }

    public boolean checkTransferencia(int cantidad) {
        return this.saldo >= cantidad;
    }

    public void sacarDinero(int cantidad) {
        this.saldo -= cantidad;
    }

    public void ingresarDinero(int cantidad) {
        this.saldo += cantidad;
    }
}
