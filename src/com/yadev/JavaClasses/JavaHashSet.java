package com.yadev.JavaClasses;

import java.util.HashSet; // Import the HashSet class

/*
HashSet de Java
Un HashSet es una colección de elementos donde cada elemento es único y
se encuentra en el java.util paquete:
*/

public class JavaHashSet {

    public static void main(String[] args) {

        //Cree un HashSet objeto llamado autos que almacenará cadenas:
        HashSet<String> cars = new HashSet<String>();

        //Agregar elementos
        //La HashSet clase tiene muchos métodos útiles. Por ejemplo, para agregarle elementos, use el add() método:
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        /*
        * Nota:
        * En el ejemplo anterior, aunque BMW se agrega dos veces,
        * solo aparece una vez en el conjunto porque cada elemento del conjunto debe ser único
        * */
        System.out.println(cars);

        //Comprobar si existe un elemento
        //Para verificar si existe un elemento en un HashSet, use el contains() método:
        cars.contains("Mazda");

        //Quitar un artículo
        //Para eliminar un elemento, utilice el remove()método:
        cars.remove("Volvo");

        //Para eliminar todos los elementos, utilice el clear()método:
        //cars.clear();

        //Tamaño del conjunto de hash
        //Para saber cuántos elementos hay, utilice el sizemétodo:
        cars.size();

        //Bucle a través de un HashSet
        //Recorra los elementos de an HashSet con un bucle for-each :
        for (String i : cars) {
          System.out.println(i);
        }

        /*
        Otros tipos
        Los elementos de un HashSet son en realidad objetos.
        En los ejemplos anteriores, creamos elementos (objetos) de tipo "Cadena".
        Recuerda que un String en Java es un objeto (no un tipo primitivo).
        Para usar otros tipos, como int, debe especificar una clase contenedora equivalente : Integer.
        Para otros tipos primitivos, use: Booleanfor boolean, Characterfor char, Doublefor double, etc:
        */

        //Use un HashSetque almacene Integer objetos:
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
