package com.yadev.JavaClasses;

/*
Enumeraciones
An enumes una "clase" especial que representa un grupo de constantes
(variables inmutables, como final variables).

Para crear un enum, use la enum palabra clave (en lugar de clase o interfaz) y
separe las constantes con una coma.
Tenga en cuenta que deben estar en letras mayúsculas:
*/

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class UsoDeEnum {

    public static void main(String[] args) {

        // Puede acceder enuma las constantes con la sintaxis de puntos :
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);  // MEDIUM

        // Enumeración en una instrucción Switch
        // Las enumeraciones se usan a menudo en switch declaraciones para verificar los valores correspondientes:
        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        // Bucle a través de una enumeración
        // El tipo de enumeración tiene un values() método que devuelve una matriz de todas las constantes de enumeración.
        // Este método es útil cuando desea recorrer las constantes de una enumeración:
        for (Level myVari : Level.values()) {
            System.out.println(myVari);
        }
    }

    /*
    * Diferencia entre enumeraciones y clases
    * Un enum puede, al igual que un class, tener atributos y métodos.
    * La única diferencia es que las constantes de enumeración son public, static y final (inmodificables, no se pueden anular).
    *
    * No enum se puede usar para crear objetos y no puede extender otras clases (pero puede implementar interfaces).
    *
    * ¿Por qué y cuándo usar enumeraciones?
    * Use enumeraciones cuando tenga valores que sepa que no van a cambiar, como meses, días, colores, baraja de cartas, etc.
    * */
}
