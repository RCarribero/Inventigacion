package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    // Lista estática para almacenar los snacks
    private static final List<Snack> snacks;

    // Bloque estático para inicializar la lista de snacks
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Patatas", 1.60));
        snacks.add(new Snack("Chocolate", 2.00));
        snacks.add(new Snack("Monster", 1.80));
        snacks.add(new Snack("RedBull", 0.90));
        snacks.add(new Snack("Donuts", 1.00));
        snacks.add(new Snack("ChupaChups", 1.20));
    }

    // Método para agregar un nuevo snack a la lista
    public static void agregarSnack(Snack snack) {
        snacks.add(snack);
        System.out.println("Snack [idSnack=" + snack.getIdSnack() + ", nombre=" + snack.getNombre() + ", precio=" + snack.getPrecio() + "]\n Añadido correctamente.");
    }

    // Método para mostrar todos los snacks en el inventario
    public static void mostrar_snacks() {
        String inventarioSnacks = "";
        for (Snack snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("---Inventario de snacks---");
        System.out.println(inventarioSnacks);
    }

    // Método para obtener la lista de snacks
    public static List<Snack> getSnacks() {
        return snacks;
    }
}
