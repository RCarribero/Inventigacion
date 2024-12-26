import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<Producto>();
        String decision;
        int id = 0;
        Scanner input = new Scanner(System.in);
        Producto producto=new Producto();
        do {
            System.out.println("¿Desea agregar un nuevo producto?");
            decision = input.nextLine();
            if (decision.equalsIgnoreCase("Si")) {
                id++;
                producto.agregarProducto(lista, input, id);
            }
        } while (!decision.equalsIgnoreCase("no"));
        producto.calcularSuma(lista);
        producto.orden(lista);
    }
}
