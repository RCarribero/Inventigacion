package Repaso.Pruebas_array;

import java.util.Scanner;

public class Prueba4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa las filas: ");
        int filas = input.nextInt();
        System.out.print("Ingresa las columnas: ");
        int columnas = input.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        System.out.println("Ingrese los valores para la matriz 1:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                matriz1[i][j] = input.nextInt();
            }
        }

        System.out.println("Ingrese los valores para la matriz 2:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                matriz2[i][j] = input.nextInt();
            }
        }

        System.out.println("La matriz resultante de la suma es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print((suma[i][j] = matriz1[i][j] + matriz2[i][j]) + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
