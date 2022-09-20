package com.yadev.JavaClasses;

/*
Herencia Java (Subclase y Superclase)
En Java, es posible heredar atributos y métodos de una clase a otra.
Agrupamos el "concepto de herencia" en dos categorías:

- subclase (hijo) - la clase que hereda de otra clase
- superclase (padre) - la clase que se hereda de

Para heredar de una clase, use la extends palabra clave.

En el siguiente ejemplo, la Carclase (subclase) hereda los atributos y métodos de la Vehicleclase
(superclase):
*/

class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute

}

public class Herencia {

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        // System.out.println(myCar.brand + " " + myCar.modelName);
        System.out.println(myCar.brand);
    }

    /*
    ¿Notaste el protectedmodificador en Vehículo?

    Establecemos el atributo de marca en Vehicle a un protected modificador de acceso . Si se configuró en private, la clase Car no podría acceder a él.

    ¿Por qué y cuándo usar "herencia"?
    - Es útil para la reutilización de código: reutiliza atributos y métodos de una clase existente cuando creas una nueva clase.
    */

    /*
    La palabra clave final
    Si no desea que otras clases hereden de una clase, use la finalpalabra clave:

    Si intenta acceder a una finalclase, Java generará un error:

    final class Vehicle {
        ...
    }

    class Car extends Vehicle {
        ...
    }
    */
}
