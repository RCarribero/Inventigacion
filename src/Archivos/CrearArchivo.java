package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "Archivo.txt";
        File archivo =  new File(nombreArchivo);
        try {
            if(archivo.exists()){
                System.out.println("El archivo ya existe");
            }else{
            //Creamos un archivo
                PrintWriter salida= new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Creacion de archivo realizada");
            }
        }catch (IOException e) {
            System.out.println("Error de creacion de archivo: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
