import java.util.List;
import java.util.Scanner;

public class Producto {
    private int idProducto;

    private String nombre;

    private Double precio;
    
    public void agregarProducto(List<Producto> lista, Scanner input) {
        System.out.println("Introduzca su nuevo producto:");
        System.out.println("Introduce nombre");
        nombre = input.nextLine();
        System.out.println("Introduce precio");
        precio = input.nextDouble();
        input.nextLine();
        idProducto++;
        lista.add(new Producto(idProducto, nombre, precio));
    }
    public void calcularSuma(List<Producto> lista) {
        int total = 0;
        for (Producto producto : lista) {
            total += producto.getPrecio();
        }
        System.out.println("El precio total de los productos es: " + total + "€");
    }
    public  void orden(List<Producto> list) {
        System.out.println("Tienes " + list.size() + " productos en tu lista");
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
        }   
    }
    
    @Override
    public String toString() {
        return "ID: " + idProducto + ", Nombre: " + nombre + ", Precio: " + precio + "€";
    }
    

    public Producto(int idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    Producto() {
    }

    private int getIdProducto() {
        return idProducto;
    }

    private void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    private double getPrecio() {
        return precio;
    }
}
