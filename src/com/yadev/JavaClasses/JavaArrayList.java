package com.yadev.JavaClasses;

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; // Import the Collections class

/*
Java ArrayList
La ArrayList clase es una matriz de tamaño variable, que se puede encontrar en el java.util paquete.

La diferencia entre una matriz integrada y una ArrayList en Java es que el tamaño de una matriz
no se puede modificar (si desea agregar o eliminar elementos de una matriz, debe crear una nueva).
Mientras que los elementos se pueden agregar y eliminar de un ArrayList cuando lo desee.
La sintaxis también es ligeramente diferente:
*/

public class JavaArrayList {

    public static void main(String[] args) {

        // Cree un ArrayListobjeto llamado autos que almacenará cadenas
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

        // La ArrayListclase tiene muchos métodos útiles. Por ejemplo, para agregar elementos al ArrayList, use el add()método:
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // Acceder a un artículo
        //Para acceder a un elemento en el ArrayList, use el get()método y consulte el número de índice:
        cars.get(0);

        // Cambiar un artículo
        // Para modificar un elemento, utilice el set()método y consulte el número de índice:
        cars.set(0, "Opel");

        // Quitar un artículo
        //Para eliminar un elemento, utilice el remove()método y consulte el número de índice:
        cars.remove(0);

        // Para eliminar todos los elementos en el ArrayList, utilice el clear()método:
        cars.clear();

        // Tamaño de ArrayList
        // Para averiguar cuántos elementos tiene un ArrayList, use el sizemétodo:
        cars.size();

        // Bucle a través de una ArrayList
        // Recorra los elementos de un ArrayListcon un for bucle y use el size() método para especificar
        // cuántas veces se debe ejecutar el bucle:

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // También puede recorrer un bucle ArrayListcon el bucle for-each :
        for (String i : cars) {
            System.out.println(i);
        }

        /*
        * Otros tipos
        * Los elementos de una ArrayList son en realidad objetos.
        * En los ejemplos anteriores, creamos elementos (objetos) de tipo "String".
        * Recuerda que un String en Java es un objeto (no un tipo primitivo).
        * Para usar otros tipos, como int, debe especificar una clase contenedora
        * equivalente: Integer.
        * Para otros tipos primitivos,
        * use: Boolean for boolean,
        * Character for char,
        * Double for double, etc:
        * */

        // Cree un ArrayList para almacenar números (agregue elementos de tipo Integer):
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (int i : myNumbers) {
            System.out.println(i);
        }

        // Ordenar una ArrayList
        // Otra clase útil en el java.util paquete es la Collections clase,
        // que incluye el sort() método para ordenar listas alfabética o numéricamente:
        Collections.sort(cars);  // Sort cars

        for (String i : cars) {
            System.out.println(i);
        }

        // Ordenar una ArrayList de enteros:
        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
