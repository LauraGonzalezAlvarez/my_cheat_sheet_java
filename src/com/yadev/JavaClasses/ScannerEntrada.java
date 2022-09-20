package com.yadev.JavaClasses;

import java.util.Scanner;  // Import the Scanner class

/*
Entrada de usuario de Java
La Scanner clase se usa para obtener la entrada del usuario y se encuentra en el java.util paquete.

Para usar la Scanner clase, cree un objeto de la clase y use cualquiera de los métodos disponibles
que se encuentran en la Scanner documentación de la clase.
En nuestro ejemplo, usaremos el nextLine() método, que se usa para leer cadenas:
*/

/*
Tipos de entrada
En el ejemplo anterior, usamos el nextLine() método, que se usa para leer cadenas.
Para leer otros tipos, consulte la siguiente tabla:

Method	        Description
nextBoolean()	Reads a boolean value from the user
nextByte()	    Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	    Reads a float value from the user
nextInt()	    Reads a int value from the user
nextLine()	    Reads a String value from the user
nextLong()	    Reads a long value from the user
nextShort()	    Reads a short value from the user

En el siguiente ejemplo, usamos diferentes métodos para leer datos de varios tipos
*/

public class ScannerEntrada {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user


        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    /*
    * Nota:
    * Si ingresa una entrada incorrecta (por ejemplo, texto en una entrada numérica),
    * obtendrá un mensaje de excepción/error (como "Excepción de error de entrada").
    *
    * Puede leer más sobre las excepciones y cómo manejar los errores en el paquete Excepciones.
    */
}
