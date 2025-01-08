package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // 1. Creación de una lista vacía usando ArrayList
        List<String> lista = new ArrayList<>();
        
        // 2. Agregando elementos a la lista
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sabado");
        lista.add("Domingo");

        // 3. Iteración clásica usando for-each (comentada)
        /*
         * for (String object : lista) {
         *     System.out.println("Dia de la semana: " + object);
         * }
         */

        // 4. Iteración usando lambda
        lista.forEach(object -> {
            System.out.println("Dia de la semana " + object);
        });

        // 5. Iteración usando método de referencia (comentada)
        // lista.forEach(System.out::println);

        // 6. Creación de una lista con elementos predefinidos usando Arrays.asList
        List<String> lista2 = Arrays.asList("Pedro", "ivan", "Nohemi");
        
        // 7. Imprimir elementos de la segunda lista
        System.out.println("Lista de nombres: ");
        lista2.forEach(System.out::println);
    }
}