package Tema_5.Listado_1.Ej_1;

import Tema_5.Listado_1.Ej_1.Excepciones.SalgoAgotadoException;

public class Bono {
    private int saldo;

    public Bono(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void añadirSaldo(int saldo){
        this.saldo += saldo;
    }

    public void viajar() throws SalgoAgotadoException {
        if(this.saldo <= 0){
            throw new SalgoAgotadoException();
        }else{
            this.saldo--;
        }

    }

    @Override
    public String toString() {
        return "Bono{" +
                "saldo=" + saldo +
                '}';
    }
}
