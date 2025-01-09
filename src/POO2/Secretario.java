package POO2;

public class Secretario extends Empleado {
    public int horasExtra;
    public Secretario(String nombre, int edad, double salario, int horasExtra) {
        super(nombre, edad, salario);
        this.horasExtra = horasExtra;
    }
    
    public double calcularSalarioTotal() {
        double bonohorasExtra=horasExtra*20;
        return salario+bonohorasExtra;
    }
    
    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }



    @Override
    public double calcularSalario() {
        return calcularSalarioTotal();
    }

    
        @Override
        public void mostrarDatos() {
            super.mostrarDatos(); // Llamamos al método de la clase base
            System.out.println("Horas extra: " + horasExtra);
            System.out.println("Salario total con horas extra: $" + calcularSalarioTotal());
        }
    

}
