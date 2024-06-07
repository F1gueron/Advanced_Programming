package Tema_1.Listado_Ejercicios;

public class Fibonnaci {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 1;
        while (num1 < 800){
            System.out.print(num1+", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
