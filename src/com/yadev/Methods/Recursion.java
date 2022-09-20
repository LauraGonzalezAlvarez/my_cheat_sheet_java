package com.yadev.Methods;

public class Recursion {

    // Java Recursion
    //Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.
    //Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.

    // Recursion Example
    //Adding two numbers together is easy to do, but adding a range of numbers is more complicated.
    // In the following example, recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers:
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // Use recursion to add all of the numbers up to 10.
        int result = sum(10);
        System.out.println(result); // 50

        /*
        Example Explained
        When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:

        10 + sum(9)
        10 + ( 9 + sum(8) )
        10 + ( 9 + ( 8 + sum(7) ) )
        ...
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

        Since the function does not call itself when k is 0, the program stops there and returns the result.
        */

        /*
        Halting Condition(condicion de parada)
        Así como los bucles pueden encontrarse con el problema de los bucles infinitos,
        las funciones recursivas pueden encontrarse con el problema de la recursividad infinita.
        La recursión infinita es cuando la función nunca deja de llamarse a sí misma.
        Cada función recursiva debe tener una condición de detención, que es la condición en la que
        la función deja de llamarse a sí misma.
        En el ejemplo anterior, la condición de detención es cuando el parámetro kse convierte en 0.

        Es útil ver una variedad de ejemplos diferentes para comprender mejor el concepto.
        En este ejemplo, la función agrega un rango de números entre un inicio y un final.
        La condición de detención para esta función recursiva es cuando end no es mayor que start :
        */

        // Use recursion to add all of the numbers between 5 to 10.
        int result2 = sum2(5, 10);
        System.out.println(result2);
    }

    /*
    El desarrollador debe tener mucho cuidado con la recursividad, ya que puede ser bastante fácil escribir una función que nunca termina,
    o una que usa cantidades excesivas de memoria o potencia del procesador.
    Sin embargo, cuando se escribe correctamente, la recursión puede ser un enfoque de programación muy eficiente y matemáticamente elegante.
    * */
    public static int sum2(int start, int end) {
        if (end > start) {
            return end + sum2(start, end - 1);
        } else {
            return end;
        }
    }
}
