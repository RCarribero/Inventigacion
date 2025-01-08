package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Snack> carrito = new ArrayList<>();
        int opcion;

        do {
            mostrarMenu();
            opcion = input.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        // Leer el ID del snack y agregarlo al carrito
                        Snacks.mostrar_snacks();
                        int idSnack = input.nextInt();
                        carrito.add(Snacks.getSnacks().get(idSnack - 1));
                        System.out.println("ok, Snack agregado: " + Snacks.getSnacks().get(idSnack - 1));
                        break;
                    case 2:
                        // Calcular y mostrar el ticket de venta
                        double total = 0;
                        System.out.println("*** Ticket de venta ***");
                        for (Snack producto : carrito) {
                            System.out.println("    -" + producto.getNombre() + " - " + producto.getPrecio() + "€");
                            total += producto.getPrecio();
                        }
                        System.out.println("    -Total: " + total + "€");
                        break;
                    case 3:
                        // Agregar un nuevo snack
                        agregarSnack(input);
                        break;
                    case 4:
                        // Salir del programa
                        System.out.println("Hasta la proxima.");
                        break;
                    default:
                        // Opción no válida
                        System.out.println("\n Introduce una respuesta valida");
                        break;
                }
            } catch (Exception e) {
                // Manejo de excepciones
                System.out.println("Ocurrio una excepcion: " + e);
                input.nextLine(); // Limpiar la entrada
            }
        } while (opcion != 4); // Repetir hasta que la opción sea 4 (salir)
    }

    // Método para mostrar el menú de opciones
    private static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Agregar Snack al carrito");
        System.out.println("2. Mostrar Ticket de venta");
        System.out.println("3. Agregar nuevo Snack");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    // Método para agregar un nuevo snack
    private static void agregarSnack(Scanner input) {
        System.out.print("Introduce el nombre del snack: ");
        String nombre = input.next();
        System.out.print("Introduce el precio del snack: ");
        double precio = input.nextDouble();
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Snack agregado: " + nombre + " - " + precio + "€");
    }
}