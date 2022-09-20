package com.yadev.ManejoArchivos;


import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class LeerArchivos {

    public static void main(String[] args) {

        /**
         * leer un archivo
         * En el capítulo anterior, aprendió cómo crear y escribir en un archivo.
         *
         * En el siguiente ejemplo, usamos la Scanner clase para leer el contenido
         * del archivo de texto que creamos en el capítulo anterior:
         */

        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // La salida será: Files in Java might be tricky, but it is fun enough!


        /**
         * Obtener información del archivo
         * Para obtener más información sobre un archivo, utilice cualquiera de los File métodos:
         */
        File myObj2 = new File("filename.txt");
        if (myObj2.exists()) {
            System.out.println("File name: " + myObj2.getName());
            System.out.println("Absolute path: " + myObj2.getAbsolutePath());
            System.out.println("Writeable: " + myObj2.canWrite());
            System.out.println("Readable " + myObj2.canRead());
            System.out.println("File size in bytes " + myObj2.length());
        } else {
            System.out.println("The file does not exist.");
        }
        /*
        La salida será:
        File name: filename.txt
        Absolute path: C:\Users\MyName\filename.txt
        Writeable: true
        Readable: true
        File size in bytes: 0
        */
    }
    /**
     * Nota:
     * Hay muchas clases disponibles en la API de Java que se pueden usar para leer y escribir archivos
     * en Java: FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter,
     * FileOutputStream, etc.
     * Cuál usar depende de la versión de Java con la que esté trabajando y si necesita leer bytes o
     * caracteres, y el tamaño del archivo/líneas, etc.
     */

}
