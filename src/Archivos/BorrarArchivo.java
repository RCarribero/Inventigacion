package Archivos;

import java.io.File;

public class BorrarArchivo {
    public static void main(String[] args) {
        // Crear un objeto de tipo File con la ruta del archivo a borrar
        File archivo = new File("Archivo.txt");

        // Verificar si el archivo existe
        if (archivo.exists()) {
            // Borrar el archivo
            archivo.delete();
            System.out.println("El archivo se ha borrado correctamente.");
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
