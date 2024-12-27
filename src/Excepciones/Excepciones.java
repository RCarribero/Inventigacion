package Excepciones;
public class Excepciones {
    public static void main(String[] args) throws Exception {
        int valor1=10,valor2=0;
        try {
            int resultado=valor1/valor2;
            System.out.println("Resultado= "+resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio algun error: " +e);
        }
        
    }
}
