package Tema_1.Listado_Ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introducir el año: ");
        int year  = s.nextInt();
        System.out.println("Introduce el mes:");
        int month = s.nextInt();
        int dias;
        switch (month){
            case 1,3,5,7,8,10,12:
                dias = 31;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
                    dias = 29;
                }else{
                    dias = 28;
                }
                break;
            case 4,6,9,11:
                dias = 30;
                break;
            default:
                dias = 0;
                break;
        }
        System.out.println("El mes tiene "+ dias + " dias");
    }
}