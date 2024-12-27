package Pruebas_array;


public class Prueba3 {
    public static void main(String[] args) {
        double a=0;
        double[][] calificaciones = {
            {85, 90, 78, 92}, // Estudiante 1
            {88, 76, 95, 89}, // Estudiante 2
            {91, 82, 84, 77}  // Estudiante 3
        };
        for(double [] filas:calificaciones){
            for(double columnas:filas){
                System.out.print(columnas+" ");
            }
            System.out.println();
        }
        for(double[] filas:calificaciones){
            for(double columnas:filas){
                a+=columnas;
            }
            System.out.println("El promedio del estudiante es: "+a/filas.length);
            a=0;
        }
    }
}
