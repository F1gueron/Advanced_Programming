package Tema_5.PowerPoint.Ej_5_3;

import Tema_5.PowerPoint.Ej_5_3.excepciones.NoMoreNumbersException;

public class Test {
    public static void main(String[] args) {

        NumerosPescaderia numeros = new NumerosPescaderia(4);
        for(int i=0; i<6; i++){
            try {
                System.out.println(numeros.getNumero(i));
            } catch (NoMoreNumbersException e) {
                throw new Error("Error en el numero",e);
            }
        }
    }
}