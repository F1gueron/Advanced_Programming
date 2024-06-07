package Tema_1.PowerPoint;

import java.util.Scanner;

public class Nombres_Ordenados {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] ordenados = new String[10];
        int count = 0;

        System.out.println("Introduce 10 nombres:");

        while (count < 10) {
            String nombre = s.nextLine();
            int pos = count;

            for (int i = 0; i < count; i++) {
                if (nombre.compareToIgnoreCase(ordenados[i]) < 0) {
                    pos = i;
                    break;
                }
            }

            for (int j = count; j > pos; j--) {
                ordenados[j] = ordenados[j - 1];
            }

            ordenados[pos] = nombre;
            count++;

            System.out.println("Array ordenado hasta ahora:");
            for (int i = 0; i < count; i++) {
                System.out.print(ordenados[i] + " ");
            }
            System.out.println();
        }

        System.out.println("Array final ordenado:");
        for (String nombre : ordenados) {
            System.out.print(nombre + " ");
        }
    }
}
