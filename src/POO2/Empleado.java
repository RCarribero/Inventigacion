package POO2;

public abstract class Empleado {   
    public String nombre="";
    public int edad=0;
    public double salario=0.00;
    
    public void mostrarDatos(){
        System.out.println("Empleado [nombre=" + nombre + ", edad=" + edad + "]");
    }
    public abstract double calcularSalario();
    public Empleado() {
    }
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
}
