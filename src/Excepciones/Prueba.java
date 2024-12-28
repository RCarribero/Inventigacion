package Excepciones;

public class Prueba {
    public static void main(String[] args) {
            try {
                System.out.println(Aritmetica.division(10, 0));
            } catch (Exception e) {
                System.out.println("Ocurrio un error: "+e);
            }finally{
                System.out.println("Esto siempre se ejecuta");
            }
    }
}