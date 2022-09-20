package com.yadev.ManejoArchivos;

import java.io.File;  // Import the File class

public class EliminaArchivo {

    public static void main(String[] args) {

        /* Eliminar un archivo
         * Para eliminar un archivo en Java, utilice el delete() método:
        **/
        File myObj = new File("filename.txt");

        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
        // La salida será: Deleted the file: filename.txt

        /**
         * Eliminar una carpeta
         * También puede eliminar una carpeta. Sin embargo, debe estar vacío:
         */
        File myObj2 = new File("C:\\Users\\MyName\\Test");

        if (myObj2.delete()) {
            System.out.println("Deleted the folder: " + myObj2.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
        // La salida será: Deleted the folder: Test
    }
}
