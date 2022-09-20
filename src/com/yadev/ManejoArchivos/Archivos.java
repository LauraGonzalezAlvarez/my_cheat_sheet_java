package com.yadev.ManejoArchivos;

import java.io.File;  // Import the File class

/**
 * El manejo de archivos es una parte importante de cualquier aplicación.
 *
 * Java tiene varios métodos para crear, leer, actualizar y eliminar archivos.
 */
public class Archivos {

    /**
     * Manejo de archivos Java
     * La File clase del java.io paquete, nos permite trabajar con archivos.
     *
     * Para usar la File clase, cree un objeto de la clase y especifique el nombre del archivo
     * o del directorio:
     */
    public static void main(String[] args) {

        File myObj = new File("filename.txt"); // Specify the filename
    }

    /**
     * La File clase tiene muchos métodos útiles para crear y obtener información sobre archivos.
     * Por ejemplo:
     *
     * Method	        Type	    Description
     * canRead()	    Boolean	    Tests whether the file is readable or not
     * canWrite()	    Boolean	    Tests whether the file is writable or not
     * createNewFile()	Boolean	    Creates an empty file
     * delete()	        Boolean	    Deletes a file
     * exists()	        Boolean	    Tests whether the file exists
     * getName()	    String	    Returns the name of the file
     * getAbsolutePath()	String	Returns the absolute pathname of the file
     * length()	        Long	    Returns the size of the file in bytes
     * list()	        String[]	Returns an array of the files in the directory
     * mkdir()  	    Boolean	    Creates a directory
     *
     * Crear, escribir, leer y eliminar archivos en los siguientes clases de este paquete:
     * CrearEscribir
     * LeerArchivos
     * BorrarArchivos
     */
}
