package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        List<Snack> carrito = new ArrayList<>();
        do {
            try {
                mostrarMenu();
                opcion = input.nextInt();
                input.nextLine();
                switch (opcion) {
                    case 1:
                        int idSnack;
                        Snacks.mostrar_snacks();
                        System.out.println("¿Que snack desea comprar? (id)");
                        idSnack = input.nextInt();
                        carrito.add(Snacks.getSnacks().get(idSnack - 1));
                        System.out.println("ok, Snack agregado: " + Snacks.getSnacks().get(idSnack - 1));
                        break;
                    case 2:
                        double total = 0;
                        System.out.println("*** Ticket de venta ***");
                        for (Snack producto : carrito) {
                            System.out.println("    -" + producto.getNombre() + " - " + producto.getPrecio() + "€");
                            total += producto.getPrecio();
                        }
                        System.out.println("    -Total: " + total + "€");
                        break;
                    case 3:
                        agregarSnack(input);
                        break;
                    case 4:
                        System.out.println("Hasta la proxima.");
                        break;
                    default:
                        System.out.println("\n Introduce una respuesta valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocurrio una excepcion: " + e);
                input.nextLine();
            }
        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Comprar snack");
        System.out.println("2. Mostrar ticket");
        System.out.println("3. Agregar Nuevo Snack");
        System.out.println("4. Salir");
        System.out.print("Elija una opcion: ");
    }

    private static void agregarSnack(Scanner input) {
        String nombre = "";
        Double precio = 0.00;
        System.out.print("Ingresa el nombre");
        nombre = input.nextLine();
        System.out.print("Ingresa el precio");
        precio = input.nextDouble();
        input.nextLine();
        Snacks.agregar_Snack(new Snack(nombre, precio));
    }
}