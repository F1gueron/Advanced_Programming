package Tema_5.Listado_1.Ej_1;

import Tema_5.Listado_1.Ej_1.Excepciones.SalgoAgotadoException;

public class Test {

    public static void main(String[] args) throws SalgoAgotadoException {
        Bono bono =  new Bono(3);
        bono.viajar();
        System.out.println(bono);
        bono.añadirSaldo(1);
        System.out.println(bono);
        for (int i = 0; i < 5; i++) {
            try {
                bono.viajar();
            }catch (SalgoAgotadoException s){
                System.out.println("Error:");
                //s.printStackTrace();
                System.out.println(s.getMessage());
            }
        }
    }


}
