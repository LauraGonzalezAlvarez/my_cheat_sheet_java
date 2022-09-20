package com.yadev.JavaClasses;

/*
Excepciones de Java - Try... Catch

Excepciones de Java
Al ejecutar código Java, pueden ocurrir diferentes errores:
errores de codificación por parte del programador, errores debido a una entrada incorrecta
u otros imprevistos.

Cuando ocurre un error, Java normalmente se detendrá y generará un mensaje de error.
El término técnico para esto es: Java lanzará una excepción (arrojará un error).

Java prueba y captura
- La try declaración le permite definir un bloque de código para probar errores mientras se ejecuta.
- La catch instrucción le permite definir un bloque de código que se ejecutará
  si ocurre un error en el bloque de prueba.
- Las palabras clave tryy catchvienen en pares:

Sintaxis
try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}

Considere el siguiente ejemplo:
Esto generará un error, porque myNumbers[10] no existe.

public class Main {
  public static void main(String[ ] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]); // error!
  }
}

La salida será algo como esto:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Main.main(Main.java:4)
*/

public class ExcepcionesJava {

    public static void main(String[] args) {

        // Si ocurre un error, podemos usar try...catch
        // para detectar el error y ejecutar algún código para manejarlo:
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        /*
        * Finally
        * La finally instrucción le permite ejecutar código después try...catch de,
        * independientemente del resultado:
        * */
        try {
            int[] myNumbers2 = {1, 2, 3};
            System.out.println(myNumbers2[10]);
        } catch (Exception e) {
            System.out.println("myNumbers2: Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        /*
        La palabra clave de lanzamiento
        La throw declaración le permite crear un error personalizado.

        La throw instrucción se utiliza junto con un tipo de excepción.
        Hay muchos tipos de excepciones disponibles en Java:
        ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException,
        SecurityException, etc:
        */
        checkAge(15); // Set age to 15 (which is below 18...)

        // Si la edad fuera 20, no obtendría una excepción:
        checkAge(20);   // Access granted - You are old enough!



    }

    // Lanza una excepción si la edad es menor de 18 años (imprime "Acceso denegado").
    // Si la edad es mayor de 18 años, escriba "Acceso concedido":
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
