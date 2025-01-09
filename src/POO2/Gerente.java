package POO2;

public class Gerente extends Empleado {
    public String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }
    public void informarDepartamento() {
        System.out.println("Departamento: " + departamento);
    }
    
    

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        informarDepartamento();
    }
    @Override
    public double calcularSalario() {
    return salario;
    }


}
