package PruebasParaTeoria;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.function.BiFunction;

public class Cuenta {

    private int numCuenta;
    private double saldo;

    // Campo para almacenar la expresión lambda que calcula el área
    BiFunction<Integer, Integer, Integer> calcularArea = (longitud, altura) -> altura * longitud;

    // Constructor
    public Cuenta() {
        // No se necesita hacer nada en el constructor
    }

    public Cuenta(int i, double v) {
        this.numCuenta = i;
        this.saldo = v;
    }

    // Ejemplo de uso:
    public void ejemplo() {
        int area = calcularArea.apply(5, 10); // Devuelve 50
        System.out.println("El área es: " + area);
    }

    public Double getSaldo() {
        return this.saldo;
    }
}
