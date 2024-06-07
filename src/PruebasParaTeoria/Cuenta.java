package PruebasParaTeoria;

public class Cuenta {
    protected int numero_cuenta;
    protected double saldo;
    public Cuenta(int numero_cuenta, double saldo) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }
    public void depositar(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }
    public void sacar(double cantidad) {
        this.saldo = this.saldo - cantidad;
    }
    public double saldo() {
        return this.saldo;
    }
}