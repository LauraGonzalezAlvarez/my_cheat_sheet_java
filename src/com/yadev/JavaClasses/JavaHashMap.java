package com.yadev.JavaClasses;

import java.util.HashMap; // import the HashMap class


/*
Java HashMap

En el ArrayList capítulo, aprendió que las matrices almacenan elementos como una colección ordenada
y debe acceder a ellos con un número de índice(int tipo).
Sin HashMap embargo, almacene elementos en pares "clave / valor ", y puede acceder a ellos mediante
un índice de otro tipo (por ejemplo, a String).

Un objeto se utiliza como clave (índice) para otro objeto (valor).
Puede almacenar diferentes tipos: String claves y Integer valores, o del mismo tipo, como:
String claves y String valores:
*/

public class JavaHashMap {

    public static void main(String[] args) {

        // Cree un HashMap objeto llamado capitalCities que almacenará String claves y String valores
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Agregar elementos
        // La HashMap clase tiene muchos métodos útiles.
        // Por ejemplo, para agregarle elementos, use el put() método:
        // Add keys and values
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");


        // Acceder a un artículo
        // Para acceder a un valor en el HashMap, use el get() método y consulte su clave:
        capitalCities.get("England");

        // Quitar un artículo
        // Para eliminar un elemento, utilice el remove()método y consulte la clave:
        capitalCities.remove("England");

        // Para eliminar todos los elementos, utilice el clear()método:
        //capitalCities.clear();

        // Tamaño del mapa hash
        //Para saber cuántos elementos hay, utilice el size() método:
        capitalCities.size();

        // Bucle a través de un HashMap
        // Recorra los elementos de a HashMapcon un bucle for-each .
        //
        //Nota:
        // Use el keySet() método si solo quiere las claves
        // use el values() método si solo quiere los valores:

        System.out.println("-----Print keys-----");

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        System.out.println("-----Print values-----");

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        System.out.println("-----Print keys and values-----");

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }System.out.println("Print values");

        /*
        * Otros tipos
        * Las claves y los valores en un HashMap son en realidad objetos.
        * En los ejemplos anteriores, usamos objetos de tipo "String".
        * Recuerda que un String en Java es un objeto (no un tipo primitivo).
        * Para usar otros tipos, como int, debe especificar una clase contenedora equivalente : Integer.
        * Para otros tipos primitivos,
        * use: Booleanfor boolean,
        * Characterfor char,
        * Doublefor double, etc:
        * */

        // Cree un HashMap objeto llamado personas que almacenará String claves y Integer valores :
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        System.out.println("----- people -----");

        for (String x : people.keySet()) {
            System.out.println("key: " + x + " value: " + people.get(x));
        }


    }
}
