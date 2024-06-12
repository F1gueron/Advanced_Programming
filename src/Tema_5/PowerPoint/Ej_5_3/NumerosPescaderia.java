package Tema_5.PowerPoint.Ej_5_3;

import Tema_5.PowerPoint.Ej_5_3.excepciones.NoMoreNumbersException;

public class NumerosPescaderia {
    private int numMax;


    public NumerosPescaderia(int numMax) {
        this.numMax = numMax;
    }

    public int getNumero(int numACtual) throws NoMoreNumbersException {
        if(numACtual >= this.numMax){
            throw new NoMoreNumbersException(numMax);
        }
        return numACtual;
    }
}
