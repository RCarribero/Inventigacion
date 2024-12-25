package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        Persona perso1 = new Persona(1,"Ruben",18);
        lista.add(perso1);
        lista.add(new Persona(2,"Gabriel",32));
        lista.add(new Persona(3,"Marta",32));
        lista.add(new Persona(4,"pepe",32));
        lista.add(new Persona(5,"Tomas",32));
        lista.add(new Persona(6,"Jarvis",32));
        for (Persona persona : lista) {
            System.out.println("Prueba: "+persona.getNombre());
        }
    }
}
