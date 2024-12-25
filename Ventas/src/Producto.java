import java.util.List;
import java.util.Scanner;

public class Producto {
    public static void agregarProducto(List<Producto> lista, Scanner input, int id) {
        System.out.println("Introduzca su nuevo producto:");
        System.out.println("Introduce nombre");
        String nombre = input.nextLine();
        System.out.println("Introduce precio");
        Double precio = input.nextDouble();
        input.nextLine();
        lista.add(new Producto(id, nombre, precio));
    }
    public static void calcularSuma(List<Producto> lista) {
        int total = 0;
        for (Producto producto : lista) {
            total += producto.getPrecio();
        }
        System.out.println("El precio total de los productos es: " + total + "€");
    }
    public static void orden(List<Producto> list) {
        System.out.println("Tienes " + list.size() + " productos en tu lista");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("El producto " + (i + 1) + " tiene la id " + list.get(i).getIdProducto() + " el nombre "
                    + list.get(i).getNombre() + " y cuesta " + list.get(i).getPrecio());
        }
    }

    private int idProducto;

    private String nombre;

    private Double precio;

    public Producto(int idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
