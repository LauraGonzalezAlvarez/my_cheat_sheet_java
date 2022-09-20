package com.yadev.JavaClasses;

/*
Clases internas de Java
En Java, también es posible anidar clases (una clase dentro de una clase).
El propósito de las clases anidadas es agrupar clases que pertenecen juntas,
lo que hace que su código sea más legible y fácil de mantener.

Para acceder a la clase interna, cree un objeto de la clase externa y
luego cree un objeto de la clase interna:
*/

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    /*
    Clase interna privada
    A diferencia de una clase "regular", una clase interna puede ser privateo protected.
    Si no desea que los objetos externos accedan a la clase interna, declare la clase como private:
    */
    class InnerClass2 {
        int y = 5;
    }

    //Clase interna estática
    //Una clase interna también puede ser static, lo que significa que puede acceder a ella sin crear un objeto de la clase externa:
    static class InnerClass3 {
        int y = 5;
    }

    //Acceder a la clase exterior desde la clase interior
    //Una ventaja de las clases internas es que pueden acceder a atributos
    // y métodos de la clase externa:
    class InnerClass4 {
        public int myInnerMethod() {
            return x;
        }
    }

}

public class ClasesInternas {

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x); // Outputs 15 (5 + 10)

        // Clase interna estática
        // Nota: al igual que static los atributos y los métodos, una static clase interna no tiene acceso a los miembros de la clase externa.
        OuterClass.InnerClass3 myInner2 = new OuterClass.InnerClass3();
        System.out.println(myInner2.y); // Outputs 5

        // Acceder a la clase exterior desde la clase interior
        OuterClass myOuter2 = new OuterClass();
        OuterClass.InnerClass4 myInnerX = myOuter.new InnerClass4();
        System.out.println(myInnerX.myInnerMethod()); // Outputs 10
    }
}
