package Tema_1.PowerPoint;

import java.util.Random;

public class Pares_Impares {
    public static void main (String[] args){
        // Definimos las dimensiones de la tabla
        int filas = 10;
        int columnas = 10;

        // Creamos la tabla de enteros
        int[][] tabla = new int[filas][columnas];

        Random random = new Random();

        int par = 0, impar = 0;

        // Inicializamos la tabla con valores del 1 al 100
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = random.nextInt(100) + 1;
                if(tabla[i][j] % 2 == 0){
                    par++;
                }else{
                    impar++;
                }
            }
        }

        // Imprimimos la tabla
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tabla[i][j] + "\t"); // \t para tabulaciones entre columnas
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        int par_cuadrado = (int) Math.sqrt(par);
        if (par_cuadrado*2 != par){
            par_cuadrado++;
        }
        int impar_cuadrado = (int) Math.sqrt(impar);
        if (impar_cuadrado*2 != impar){
            impar_cuadrado++;
        }

        int[][] tablaPar = new int[par_cuadrado][par_cuadrado];
        int[][] tablaImpar = new int[impar_cuadrado][impar_cuadrado];

        int filaPar = 0, columnaPar = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tabla[i][j] % 2 == 0){
                    tablaPar[filaPar][columnaPar] = tabla[i][j];
                    columnaPar++;
                    if (columnaPar == par_cuadrado) {
                        columnaPar = 0;
                        filaPar++;
                    }
                }
            }
        }
    }
}
