package com.yadev.ManejoArchivos;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors


/**
 * Crear un archivo
 * Para crear un archivo en Java, puede utilizar el createNewFile() método.
 * Este método devuelve un valor booleano: true si el archivo se creó correctamente y false
 * si el archivo ya existe.
 * Tenga en cuenta que el método está encerrado en un try...catch bloque.
 * Esto es necesario porque arroja un mensaje IOException si ocurre un error
 * (si el archivo no se puede crear por alguna razón):
 */
public class CrearEscribirArchivos {

    public static void main(String[] args) {

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // La salida será: File created: filename.

        /**
         * Para crear un archivo en un directorio específico (requiere permiso), especifique la ruta
         * del archivo y use barras invertidas dobles para escapar del \carácter " " (para Windows).
         * En Mac y Linux, puede simplemente escribir la ruta, como: /Users/name/filename.txt
         */
        File myObj = new File("C:\\Users\\MyName\\filename.txt");


        /**
         * Escribir en un archivo
         * En el siguiente ejemplo, usamos la FileWriter clase junto con su write() método para
         * escribir texto en el archivo que creamos en el ejemplo anterior.
         * Tenga en cuenta que cuando termine de escribir en el archivo, debe cerrarlo con el close()
         * método:
         */
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // Successfully wrote to the file.
    }
}
