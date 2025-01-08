package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        // 2. Creación del Map usando HashMap
        // HashMap es una implementación de Map que almacena pares clave-valor
        Map<String, String> persona = new HashMap<>(); 

        // 3. Agregando elementos al mapa
        persona.put("Nombre", "Diego");    // Agrega nombre
        persona.put("Edad", "25");         // Agrega edad inicial
        persona.put("Edad", "252");        // Sobreescribe la edad anterior
        persona.put("Apellido", "Fiores"); // Agrega apellido

        // 4. Primera forma de iterar: usando entrySet()
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // 5. Segunda forma de iterar: usando forEach con lambda
        System.out.println("Iterando elementos por separado: ");
        persona.forEach((Llave,Valor)->{
            System.out.println("Llave: "+Llave+" ,valor: "+Valor);
        });
    }
}
