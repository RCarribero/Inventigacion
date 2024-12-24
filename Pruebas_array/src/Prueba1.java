package  Repaso.Pruebas_array;
import java.util.Scanner;
public class Prueba1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sumaPrecio=0,promedioPrecio=0;
        int [] opcion= new int[5];
        for (int i = 0; i < opcion.length; i++) {
            System.out.println("Ingrese un valor para la posicion "+(i+1)+":");
            opcion[i] = input.nextInt();
        }
        for (int i = 0; i < opcion.length; i++) {
            System.out.println("La posicion "+(i+1)+" tiene el valor: "+opcion[i]);
        }
        for (int i = 0; i < opcion.length; i++) {
            sumaPrecio +=opcion[i];
            promedioPrecio=(sumaPrecio/opcion.length);
        }
        System.out.println("Suma de los precios: "+sumaPrecio);
        System.out.println("El promedio de los precios es: "+promedioPrecio);
        input.close();
    }
}
