package com.yadev.JavaClasses;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

/*
Fechas Java
Java no tiene una clase de fecha incorporada, pero podemos importar el java.time
paquete para que funcione con la API de fecha y hora.
El paquete incluye muchas clases de fecha y hora. Por ejemplo:

Class	        Description
LocalDate	    Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	    Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
*/

/*
El ofPattern() método acepta todo tipo de valores, si desea mostrar
la fecha y la hora en un formato diferente. Por ejemplo:

Value	        Example	Tryit
yyyy-MM-dd	    "1988-09-29"
dd/MM/yyyy	    "29/09/1988"
dd-MMM-yyyy	    "29-Sep-1988"
E, MMM dd yyyy	"Thu, Sep 29 1988"
*/

public class DateAndTime {

    public static void main(String[] args) {

        // Mostrar fecha actual
        // Para mostrar la fecha actual, importa la java.time.LocalDateclase y usa su now()método:
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        // Mostrar hora actual
        // Para mostrar la hora actual (hora, minuto, segundo y nanosegundos), importa la java.time.LocalTime clase y usa su now() método:
        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);

        // Mostrar fecha y hora actuales
        //Para mostrar la fecha y la hora actuales, importa la java.time.LocalDateTimeclase y usa su now()método:
        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3);

        // Formateo de fecha y hora
        // La "T" en el ejemplo anterior se usa para separar la fecha de la hora.
        // Puede usar la DateTimeFormatter clase con el ofPattern() método en el mismo paquete para formatear o analizar objetos de fecha y hora. El siguiente ejemplo eliminará tanto la "T" como los nanosegundos de la fecha y hora:
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
