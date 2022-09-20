package com.yadev.JavaClasses;

/*
Paquetes Java y API
Un paquete en Java se usa para agrupar clases relacionadas.
Piense en ello como una carpeta en un directorio de archivos .
Usamos paquetes para evitar conflictos de nombres y para escribir un código mejor mantenible.
Los paquetes se dividen en dos categorías:

Paquetes integrados (paquetes de la API de Java)
Paquetes definidos por el usuario (cree sus propios paquetes)
*/

/*
Paquetes incorporados
La API de Java es una biblioteca de clases preescritas,
de uso gratuito, incluidas en el entorno de desarrollo de Java.

La biblioteca contiene componentes para administrar entradas, programar bases de datos y mucho más.
La lista completa se puede encontrar en el sitio web de Oracle: https://docs.oracle.com/javase/8/docs/api/ .

La biblioteca se divide en paquetes y clases.
Lo que significa que puede importar una sola clase (junto con sus métodos y atributos)
o un paquete completo que contenga todas las clases que pertenecen al paquete especificado.

Para usar una clase o un paquete de la biblioteca, debe usar la import palabra clave:

import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
*/

/*
Importar una clase
Si encuentra una clase que desea usar, por ejemplo, la Scannerclase
que se usa para obtener la entrada del usuario , escriba el siguiente código:

import java.util.Scanner;

En el ejemplo anterior, java.utiles un paquete, mientras que Scanneres una clase del java.utilpaquete.

Para usar la Scannerclase, cree un objeto de la clase y use cualquiera de los métodos disponibles
que se encuentran en la Scannerdocumentación de la clase.
En nuestro ejemplo, usaremos el nextLine()método, que se usa para leer una línea completa:
*/

/*
Importar un paquete
Hay muchos paquetes para elegir. En el ejemplo anterior, usamos la Scannerclase del java.utilpaquete.
Este paquete también contiene instalaciones de fecha y hora, generador de números aleatorios y otras clases de utilidad.

Para importar un paquete completo, finalice la oración con un signo de asterisco (*).
El siguiente ejemplo importará TODAS las clases en el java.utilpaquete:

import java.util.*;
*/

/*
Paquetes definidos por el usuario
Para crear su propio paquete, debe comprender que Java utiliza un directorio del sistema de archivos
para almacenarlos. Al igual que las carpetas en su computadora:

└── root
  └── mypack
    └── MyPackageClass.java

Para crear un paquete, utilice la packagepalabra clave:

MiClaseDePaquete.java

package mypack;

class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}

Guarde el archivo como MyPackageClass.java y compílelo:
C:\Users\Your Name>javac MyPackageClass.java

Luego compila el paquete:
C:\Users\Your Name>javac MyPackageClass.java

Esto obliga al compilador a crear el paquete "mypack".

La -d palabra clave especifica el destino donde guardar el archivo de clase.
Puede usar cualquier nombre de directorio, como c:/user (windows) o,
si desea mantener el paquete dentro del mismo directorio, puede usar el signo de punto " .",
como en el ejemplo anterior.

Nota: El nombre del paquete debe escribirse en minúsculas para evitar conflictos con los nombres
de las clases.

Cuando compilamos el paquete en el ejemplo anterior, se creó una nueva carpeta, llamada "mypack".

Para ejecutar el archivo MyPackageClass.java , escriba lo siguiente:
C:\Users\Your Name>java mypack.MyPackageClass

La salida será:
This is my package!
*/


import java.util.Scanner;

public class PaqueteJavaAPI {

    public static void main(String[] args) {

        // Usando la Scannerclase para obtener la entrada del usuario:
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
