package com.yadev.JavaClasses;

/*
Encapsulación
El significado de Encapsulación es asegurarse de que los datos "sensibles" estén ocultos para los usuarios. Para lograr esto, debes:

- declarar variables/atributos de clase comoprivate
- proporcionar métodos públicos get y set para acceder y actualizar el valor de una private variable
*/

/*
¿Por qué encapsulación?
- Mejor control de los atributos y métodos de clase.
- Los atributos de clase se pueden hacer de solo lectura (si solo usa el getmétodo) o de solo escritura (si solo usa el setmétodo)
- Flexible: el programador puede cambiar una parte del código sin afectar otras partes
- Mayor seguridad de los datos
*/

/*
Obtener y establecer
En el capítulo anterior aprendiste que privatesolo se puede acceder a las variables dentro
de la misma clase (una clase externa no tiene acceso a ellas).
Sin embargo, es posible acceder a ellos si proporcionamos métodos públicos de obtención y
configuración .

El getmétodo devuelve el valor de la variable y el setmétodo establece el valor.

La sintaxis para ambos es que comienzan con geto set, seguido del nombre de la variable,
con la primera letra en mayúscula:
*/
class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class Encapsulamiento {

    public static void main(String[] args) {

         /*
    Ejemplo explicado
    El getmétodo devuelve el valor de la variable name.

    El setmétodo toma un parámetro ( newName) y lo asigna a la namevariable. La thispalabra clave se utiliza para referirse al objeto actual.

    Sin embargo, como la namevariable se declara como private, no podemos acceder a ella desde fuera de esta clase:
    */
        // Si la variable se declarara como public, esperaríamos el siguiente resultado: John
        // Sin embargo, cuando intentamos acceder a una privatevariable, obtenemos un error:
        Person persona = new Person();
        // persona.name = "John";  // error
        // System.out.println(persona.name); //

        // En su lugar, usamos los métodos getName()y para acceder y actualizar la variable:setName()
        persona.setName("John"); // Set the value of the name variable to "John"
        System.out.println(persona.getName());  // Outputs "John"
    }
}
