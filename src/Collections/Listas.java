package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sabado");
        lista.add("Domingo");
        // For each clasico
        /*
         * for (String object : lista) {
         * System.out.println("Dia de la semana: " + object);
         * }
         */
        // For each landa
        lista.forEach(object -> {
            System.out.println("Dia de la semana " + object);
        });
        // Landa compacto
        // lista.forEach(System.out::println);
        List<String> lista2 = Arrays.asList("Pedro", "ivan", "Nohemi");
        System.out.println("Lista de nombres: ");
        lista2.forEach(System.out::println);
    }
}
