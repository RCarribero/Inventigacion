package maquina_snacks;

import java.io.Serializable;

// Clase Snack que representa un snack con id, nombre y precio
public class Snack implements Serializable {
    // Contador estático para llevar la cuenta de los snacks creados
    private static int contadorSnacks = Snacks.getSnacks().size();

    // Método estático para obtener el contador de snacks
    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    // Atributos de la clase Snack
    private int idSnack;
    private String nombre;
    private double precio;

    // Constructor por defecto
    public Snack() {
        // Incrementa el contador de snacks y asigna el id
        this.idSnack = ++Snack.contadorSnacks;
    }

    // Constructor con parámetros
    public Snack(String nombre, double precio) {
        this(); // Llama al constructor por defecto
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el precio
    public double getPrecio() {
        return precio;
    }

    // Setter para el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Snack [ idSnack=" + idSnack + ", nombre=" + nombre + ", precio=" + precio + "€ ]";
    }

    // Método hashCode para generar un código hash único para cada objeto Snack
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idSnack;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Snack other = (Snack) obj;
        if (idSnack != other.idSnack)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    }

    public int getIdSnack() {
        return idSnack;
    }

}
