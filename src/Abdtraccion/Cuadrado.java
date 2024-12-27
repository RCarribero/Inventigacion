package Abdtraccion;

public class Cuadrado implements Figura,Dibujable {
    private double lados;

    public Cuadrado(double lados) {
        this.lados = lados;
    }

    public Cuadrado() {
    }

    @Override
    public double calcularArea() {
        double resultado=lados*lados;
        return resultado;
    }

    @Override
    public void Dibujable() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }
}
