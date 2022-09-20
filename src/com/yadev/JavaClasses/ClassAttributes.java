package com.yadev.JavaClasses;

/*
Atributos de clase de Java
En el capítulo anterior, usamos el término "variable" xen el ejemplo (como se muestra a continuación).
En realidad es un atributo de la clase.
O podría decir que los atributos de clase son variables dentro de una clase:

Ejemplo
Cree una clase llamada "Main" con dos atributos: x y y:
Otro término para atributos de clase es campos .
*/
class Main {
    int x = 5;
    int y = 3;

    // Si no desea tener la capacidad de anular los valores existentes, declare el atributo como final:
    final int z = 10;

    // Atributos Múltiples
    //Puede especificar tantos atributos como desee:
    String fname = "John";
    String lname = "Doe";
    int age = 24;
}

public class ClassAttributes {

    // Accediendo a los Atributos
    // Puede acceder a los atributos creando un objeto de la clase y usando la sintaxis de puntos ( .):

    // El siguiente ejemplo creará un objeto de la Mainclase, con el nombre myObj. Usamos el x atributo en el objeto para imprimir su valor:
    public static void main(String[] args) {

        // Cree un objeto llamado " myObj" e imprima el valor de x:
        Main myObj = new Main();
        System.out.println(myObj.x);

        // Modificar atributos
        // También puede modificar los valores de los atributos:

        // Establezca el valor de xen 40:
        myObj.x = 40;
        System.out.println(myObj.x);

        // O anular los valores existentes:
        // Cambia el valor de xa 25:
        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);

        // La finalpalabra clave es útil cuando desea que una variable almacene siempre el mismo valor, como PI (3.14159...).
        //La finalpalabra clave se llama "modificador". Aprenderá más sobre estos en el capítulo Modificadores de Java .

        // myObj.z = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.z);

        /*
        Objetos Múltiples
        Si crea varios objetos de una clase, puede cambiar los valores de atributo en un objeto,
        sin afectar los valores de atributo en el otro:
        */

        // Cambie el valor de xa 25 in y myObj2déjelo sin cambios:xmyObj1
        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25

        // Atributos Múltiples
        //Puede especificar tantos atributos como desee:
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
