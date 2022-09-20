package com.yadev.JavaClasses;

/*
Interfaces
Otra forma de lograr la abstracción en Java es con interfaces.

An interfacees una "clase abstracta" completamente que se usa para agrupar métodos
relacionados con cuerpos vacíos:
*/

interface Animalito {
    public void animalSound(); // interface method (does not have a body)

    public void run(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

// Para acceder a los métodos de la interfaz, la interfaz debe ser "implementada"
// (algo así como heredada) por otra clase con la implements palabra clave (en lugar de extends).
// El cuerpo del método de interfaz lo proporciona la clase "implementar":

// Pig "implements" the Animal interface
class Puerco implements Animalito {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void run() {
        System.out.println("hoy hoy hoy corre!!");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class Interfaz {

    public static void main(String[] args) {

        Puerco myPig = new Puerco();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        myPig.run();

        // Varias interfaces
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

/*
Notas sobre las interfaces:
- Al igual que las clases abstractas , las interfaces no se pueden usar para crear objetos
  (en el ejemplo anterior, no es posible crear un objeto "Animal" en MyMainClass)
- Los métodos de interfaz no tienen cuerpo: el cuerpo lo proporciona la clase "implementar"
- En la implementación de una interfaz, debe anular todos sus métodos
- Los métodos de interfaz son por defecto abstracty public
- Los atributos de la interfaz son por defecto publicy staticfinal
- Una interfaz no puede contener un constructor (ya que no se puede usar para crear objetos)

¿Por qué y cuándo usar interfaces?

1) Para lograr la seguridad, oculte ciertos detalles y solo muestre los detalles importantes de un objeto (interfaz).

2) Java no admite "herencia múltiple" (una clase solo puede heredar de una superclase). Sin embargo, se puede lograr con interfaces, porque la clase puede implementar múltiples interfaces. Nota: Para implementar múltiples interfaces, sepárelas con una coma (vea el ejemplo a continuación).
*/

// Múltiples interfaces
// Para implementar varias interfaces, sepárelas con una coma:
interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}