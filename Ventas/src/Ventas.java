import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<Producto>();
        String decision;
        int id = 1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("¿Desea agregar un nuevo producto?");
            decision = input.nextLine();
            if (decision.equalsIgnoreCase("Si")) {
                Producto.agregarProducto(lista, input, id);
                id++;
            }
        } while (!decision.equalsIgnoreCase("no"));
        Producto.calcularSuma(lista);
        Producto.orden(lista);
    }
}
