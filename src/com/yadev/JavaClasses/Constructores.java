package com.yadev.JavaClasses;

/*
* Constructores Java
* Un constructor en Java es un método especial que se usa para inicializar objetos.
* Se llama al constructor cuando se crea un objeto de una clase.
* Se puede utilizar para establecer valores iniciales para atributos de objetos:
* */

/*
* Tenga en cuenta que el nombre del constructor debe coincidir con el nombre de la clase
* y no puede tener un tipo de retorno (como void).
* También tenga en cuenta que se llama al constructor cuando se crea el objeto.
* Todas las clases tienen constructores por defecto: si no crea un constructor de clase usted mismo,
* Java crea uno para usted.
* Sin embargo, no podrá establecer valores iniciales para los atributos del objeto.
* */

public class Constructores {

    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    public Constructores() {
        x = 5;  // Set the initial value for the class attribute x
    }

    /*
    * Parámetros del constructor
    * Los constructores también pueden tomar parámetros, que se utilizan para inicializar atributos.
    *
    * El siguiente ejemplo agrega un int yparámetro al constructor.
    * Dentro del constructor establecemos x a y (x=y).
    * Cuando llamamos al constructor, le pasamos un parámetro al constructor (5),
    * que establecerá el valor de x en 5:
    * */
    public Constructores(int y) {
        x = y;
    }

    // Puedes tener tantos parámetros como quieras:
    int modelYear;
    String modelName;

    public Constructores(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {

        Constructores myObj = new Constructores(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x

        // Outputs 5
        Constructores myObj2 = new Constructores(5);
        System.out.println(myObj2.x);

        // Outputs 1969 Mustang
        Constructores myCar = new Constructores(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
