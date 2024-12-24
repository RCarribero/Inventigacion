public class Circulo implements  Figura,Dibujable,Rotar{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    @Override
    public double calcularArea() {
        double resultado=3.14*(radio*radio);
        return resultado;
    }

    @Override
    public void Dibujable() {
        System.out.println("Hola estoy dibujando un circulo");
    }

    @Override
    public void Rotar() {
        System.out.println("Hola estoy rotando un circulo");
    }

}
