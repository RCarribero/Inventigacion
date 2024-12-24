package  Repaso.Pruebas_array;
import java.util.Scanner;
public class Prueba2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Ingresa num de filas: ");
        int filas = input.nextInt();
        System.out.print("Ingresa num de columnas: ");
        int columnas = input.nextInt();
        int [][] tabla= new int[filas][columnas];
        for (int x = 0; x < tabla.length; x++) {
            for (int y = 0; y < tabla[x].length; y++) {
                System.out.println("Ingresa un valor para la posicion [" + x + "][" + y + "]");
                tabla[x][y]=input.nextInt();
            }
        }
        System.out.println("Esta es la matriz: ");
        for (int[] tabla1 : tabla) {
            for (int valor : tabla1) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
