package Archivos;

import java.io.File;

public class BorrarArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo2.txt";
        File archivo =  new File(nombreArchivo);
        if(archivo.exists()){
            if(archivo.delete()){
                System.out.println("El archivo ha sido borrado");
            }else{
                System.out.println("El archivo no pudo ser borrado");
            }
        }else{
            System.out.println("El archivo no existe");
        }
    }
}
