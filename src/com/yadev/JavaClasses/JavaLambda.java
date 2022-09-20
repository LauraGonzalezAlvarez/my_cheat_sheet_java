package com.yadev.JavaClasses;

/*
Expresiones Java Lambda
Las expresiones lambda se agregaron en Java 8.
Una expresión lambda es un bloque corto de código que toma parámetros y devuelve un valor.
Las expresiones lambda son similares a los métodos, pero no necesitan un nombre
y se pueden implementar directamente en el cuerpo de un método.

Sintaxis
La expresión lambda más simple contiene un solo parámetro y una expresión:

parameter -> expression

Para usar más de un parámetro, envuélvalos entre paréntesis:

(parameter1, parameter2) -> expression

Las expresiones son limitadas.
Deben devolver inmediatamente un valor y no pueden contener variables, asignaciones o declaraciones
como if o for.
Para realizar operaciones más complejas, se puede usar un bloque de código con llaves.
Si la expresión lambda necesita devolver un valor, entonces el bloque de código debe tener
una return declaración.

(parameter1, parameter2) -> { code block }
*/

import java.util.ArrayList;
import java.util.function.Consumer;

public class JavaLambda {

    // Uso de expresiones lambda
    // Las expresiones lambda generalmente se pasan como parámetros a una función:
    public static void main(String[] args) {

        // Use una expresión lambda en el ArrayListmétodo forEach()para imprimir cada elemento de la lista:
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach( (n) -> { System.out.println(n); } );

        /*
        * Las expresiones lambda se pueden almacenar en variables si el tipo de variable es una interfaz
        * que tiene un solo método.
        * La expresión lambda debe tener la misma cantidad de parámetros y el mismo tipo de retorno que ese método.
        * Java tiene muchos de estos tipos de interfaces integrados, como la Consumer interfaz
        * (que se encuentra en el java.util paquete) utilizada por las listas.
        * */

        // Use la interfaz de Java Consumerpara almacenar una expresión lambda en una variable:
        Consumer<Integer> method = (x) -> { System.out.println(x); };
        numbers.forEach( method );

        // Cree un método que tome una expresión lambda como parámetro:
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    // Cree un método que tome una expresión lambda como parámetro:
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}


/*
* Para usar una expresión lambda en un método, el método debe tener un parámetro con una interfaz de método único como tipo.
* Llamar al método de la interfaz ejecutará la expresión lambda:
* */
interface StringFunction {
    String run(String str);
}
