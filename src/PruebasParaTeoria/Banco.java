package PruebasParaTeoria;

public class Banco {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(3456738, 10456.78);
        System.out.println("Saldo en la cuenta "+ c.getSaldo());
    }
}
