package com.yadev.JavaClasses;

/*
Polimorfismo de Java
Polimorfismo significa "muchas formas", y ocurre cuando tenemos muchas clases que están relacionadas
entre sí por herencia.

Como especificamos en el capítulo anterior; La herencia nos permite heredar atributos y métodos de
otra clase.
El polimorfismo usa esos métodos para realizar diferentes tareas.
Esto nos permite realizar una misma acción de diferentes maneras.

Por ejemplo, piense en una superclase llamada Animalque tiene un método llamado animalSound().
Las subclases de animales pueden ser cerdos, gatos, perros, pájaros,
y también tienen su propia implementación de un sonido animal (el cerdo gruñe y el gato maúlla, etc.):
*/
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cerdo extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class Polimorfismo {

    public static void main(String[] args) {

        // Ahora podemos crear objetos y llamar al Pigmétodo en ambos: DoganimalSound()
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Cerdo();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }

    /*
    ¿Por qué y cuándo usar "herencia" y "polimorfismo"?
    - Es útil para la reutilización de código: reutiliza atributos y métodos de una clase existente cuando creas una nueva clase.
    */
}
