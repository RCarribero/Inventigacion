import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<Producto>();
        String decision;
        Scanner input = new Scanner(System.in);
        Producto producto=new Producto();
        do {
            System.out.println("¿Desea agregar un nuevo producto?");
            decision = input.nextLine();
            if (decision.equalsIgnoreCase("Si")) {
                producto.agregarProducto(lista, input);
            }
        } while (!decision.equalsIgnoreCase("no"));
        producto.calcularSuma(lista);
        producto.orden(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
}