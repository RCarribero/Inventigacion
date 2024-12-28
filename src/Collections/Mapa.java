package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>(); 
        persona.put("Nombre", "Diego");
        persona.put("Edad", "25");
        persona.put("Edad", "252");//no se permiten duplicados
        persona.put("Apellido", "Fiores");
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);
        System.out.println("Iterando elementos por separado: ");
        persona.forEach((Llave,Valor)->{
            System.out.println("Llave: "+Llave+" ,valor: "+Valor);
        });
    }
}
