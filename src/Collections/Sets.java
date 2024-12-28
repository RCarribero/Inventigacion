package Collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //No admite valores duplicados y aparte ordena automaticamente
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Carla");
        conjunto.add("Victoria");
        System.out.println("Elementos del set");
        conjunto.forEach(System.out::println);
        conjunto.remove("Carla");
        //Elimina un elemento 
        System.out.println("\nNuevos elementos");
        conjunto.forEach(System.out::println);
    }
}
