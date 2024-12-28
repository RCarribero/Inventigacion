package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    static{
        snacks = new ArrayList<>(); 
        snacks.add(new Snack("Patatas",1.60));
        snacks.add(new Snack("Chocolate",2.00));
        snacks.add(new Snack("Monster",1.80));
        snacks.add(new Snack("RedBull",0.90));
        snacks.add(new Snack("Donuts",1.00));
        snacks.add(new Snack("ChupaChups",1.20));
    }

    public static void agregar_Snack(Snack snack) {
        snacks.add(snack);
        System.out.println("Snack [idSnack=" + snack.getIdSnack() + ", nombre=" + snack.getNombre() + ", precio=" + snack.getPrecio() + "]\n Añadido correctamente.");
    }

    public static void mostrar_snacks() {
        String inventarioSnacks="";
        for (Snack snack : snacks) {
            inventarioSnacks+=snack.toString()+"\n";
        }
        System.out.println("---Inventario de snacks---");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }


}
