package com.yadev.JavaClasses;

/*
Subprocesos de Java

Threads permite que un programa funcione de manera más eficiente al hacer varias cosas al mismo tiempo.

Los subprocesos se pueden utilizar para realizar tareas complicadas en segundo plano sin interrumpir
el programa principal.
*/

/*
Diferencias entre hilos "extendidos" e "implementados"

La principal diferencia es que cuando una clase extiende la clase Thread,
no puede extender ninguna otra clase, pero al implementar la interfaz Runnable,
también es posible extender desde otra clase, como:
class MyClass extends OtherClass implements Runnable.
*/

/*
Problemas de concurrencia
Debido a que los subprocesos se ejecutan al mismo tiempo que otras partes del programa,
no hay forma de saber en qué orden se ejecutará el código.
Cuando los subprocesos y el programa principal leen y escriben las mismas variables,
los valores son impredecibles.
Los problemas que resultan de esto se llaman problemas de concurrencia.
*/

/*
* Crear un hilo
* Hay dos formas de crear un hilo.
* Se puede crear extendiendo la Thread clase y anulando su run() método:
*/
public class JavaThreadsSubprocesosHilos extends Thread {

    public void run() {
        System.out.println("This code is running in a thread");
    }

    /*
    * Subprocesos en ejecución
    * Si la clase extiende la Thread clase, el subproceso se puede ejecutar
    * creando una instancia de la clase y llamando a su start() método:
    */
    public static void main(String[] args) {

        JavaThreadsSubprocesosHilos thread = new JavaThreadsSubprocesosHilos();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}

/*
* Otra forma de crear un hilo es implementar la Runnable interfaz
*/
class OtraFormaDeHilo implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }

    /*
    * Si la clase implementa la Runnable interfaz, el subproceso se puede ejecutar
    * pasando una instancia de la clase al Thread constructor de un objeto y
    * luego llamando al start() método del subproceso:
    */
    public static void main(String[] args) {

        OtraFormaDeHilo obj = new OtraFormaDeHilo();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}

// Ejemplo Problemas de concurrencia
// Un ejemplo de código donde el valor de la cantidad variable es impredecible:
class ProblemaConcurrencia extends Thread {

    public static int amount = 0;

    public static void main(String[] args) {
        ProblemaConcurrencia thread = new ProblemaConcurrencia();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}

// Ejemplo evitar problea concurrecion
/*
* Para evitar problemas de simultaneidad, es mejor compartir la menor cantidad posible de
* atributos entre subprocesos.
* Si es necesario compartir los atributos, una posible solución es usar el isAlive()
* método del subproceso para verificar si el subproceso ha terminado de ejecutarse antes
* de usar cualquier atributo que el subproceso pueda cambiar.
*/

// Úselo isAlive()para evitar problemas de concurrencia:
class EvitarConcurrencia extends Thread {

    public static int amount = 0;

    public static void main(String[] args) {

        EvitarConcurrencia thread = new EvitarConcurrencia();
        thread.start();

        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }

        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;

        System.out.println("Main: " + amount);
    }

    public void run() {
        amount++;
    }
}
