package com.yadev.JavaClasses;

/*
Clases abstractas y métodos
La abstracción de datos es el proceso de ocultar ciertos detalles y mostrar solo
la información esencial al usuario.
La abstracción se puede lograr con clases abstractas o interfaces

- La abstract palabra clave es un modificador de no acceso, utilizado para clases y métodos:

Clase abstracta: es una clase restringida que no se puede usar para crear objetos (para acceder a ella, se debe heredar de otra clase).

Método abstracto: solo se puede usar en una clase abstracta y no tiene cuerpo. El cuerpo lo proporciona la subclase (heredada de).
Una clase abstracta puede tener métodos abstractos y regulares:
*/
abstract class Animales {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
    /*
    Del ejemplo anterior, no es posible crear un objeto de la clase Animal:

    Animal myObj = new Animal(); // will generate an error

    Para acceder a la clase abstracta, se debe heredar de otra clase. Convirtamos la clase Animal que usamos en el capítulo Polimorfismo en una clase abstracta:
    */
}

// Subclass (inherit from Animal)
class Pig extends Animales {

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class Abstraccion {

    public static void main(String[] args) {

        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
    /*
    * ¿Por qué y cuándo usar clases y métodos abstractos?
    * Para lograr la seguridad, oculte ciertos detalles y solo muestre los detalles importantes de un objeto.
    * Nota: La abstracción también se puede lograr con Interfaces.
    * */
}
