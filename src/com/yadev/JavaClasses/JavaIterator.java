package com.yadev.JavaClasses;

// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

/*
Iterador de Java
An Iteratores un objeto que se puede usar para recorrer colecciones, como ArrayList y HashSet.
Se llama "iterador" porque "iterar" es el término técnico para bucle.

Para usar un iterador, debe importarlo desde el java.util paquete.
*/

public class JavaIterator {

    public static void main(String[] args) {

        // Obtener un iterador
        //El iterator()método se puede utilizar para obtener un Iteratorpara cualquier colección:

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        // Bucle a través de una colección
        // Para recorrer una colección, use los métodos hasNext() y de :next() Iterator
        while(it.hasNext()) {
          System.out.println(it.next());
        }

        // Eliminación de elementos de una colección
        // Los iteradores están diseñados para cambiar fácilmente las colecciones que recorren.
        // El remove() método puede eliminar elementos de una colección durante el bucle.

        // Use un iterador para eliminar números menores de 10 de una colección:
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> num = numbers.iterator();

        while(num.hasNext()) {
            Integer i = num.next();
            if(i < 10) {
                num.remove();
            }
        }

        System.out.println(numbers);

        /*
        * Nota: Intentar eliminar elementos usando un bucle for o un bucle for-each no funcionaría
        * correctamente porque la colección cambia de tamaño al mismo tiempo que el código
        * intenta hacer un bucle.
        * */
    }

}
