package com.yadev.JavaClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
¿Qué es una expresión regular?

Una expresión regular es una secuencia de caracteres que forma un patrón de búsqueda.
Cuando busca datos en un texto, puede usar este patrón de búsqueda para describir lo que
está buscando.

Una expresión regular puede ser un solo carácter o un patrón más complicado.

Las expresiones regulares se pueden utilizar para realizar todo tipo de operaciones de búsqueda
y reemplazo de texto .

Java no tiene una clase de expresión regular incorporada, pero podemos importar el java.util.regex
paquete para trabajar con expresiones regulares. El paquete incluye las siguientes clases:

Pattern Clase - Define un patrón (para ser usado en una búsqueda)
Matcher Clase - se utiliza para buscar el patrón.
PatternSyntaxException Clase - indica un error de sintaxis en un patrón de expresión regular
*/

public class ExpresionesRegularesJava {

    /*
    Ejemplo explicado
    En este ejemplo, se busca la palabra "w3schools" en una oración.

    Primero, el patrón se crea utilizando el Pattern.compile() método.
    El primer parámetro indica qué patrón se está buscando y
    el segundo parámetro tiene un indicador que indica que la búsqueda
    no debe distinguir entre mayúsculas y minúsculas.
    El segundo parámetro es opcional.

    El matcher() método se utiliza para buscar el patrón en una cadena.
    Devuelve un objeto Matcher que contiene información sobre la búsqueda realizada.

    El find() método devuelve verdadero si el patrón se encontró en la cadena y
    falso si no se encontró.
    */

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");

        boolean matchFound = matcher.find();

        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");  // Outputs Match found
        }
    }

    /*
    Flags - banderas

    Flags en el compile() método cambian la forma en que se realiza la búsqueda.
    Éstos son algunos de ellos:

    Pattern.CASE_INSENSITIVE- Se ignorará el caso de las letras al realizar una búsqueda.

    Pattern.LITERAL - Los caracteres especiales del patrón no tendrán ningún significado
    especial y se tratarán como caracteres normales al realizar una búsqueda.

    Pattern.UNICODE_CASE - Úselo junto con la CASE_INSENSITIVE bandera para ignorar
    también el caso de letras fuera del alfabeto inglés
    */

    /*
    Patrones de expresiones regulares

    El primer parámetro del Pattern.compile() método es el patrón. Describe lo que se busca.

    Los corchetes se utilizan para encontrar un rango de caracteres:

    Expression	Description
    [abc]	    Find one character from the options between the brackets
    [^abc]	    Find one character NOT between the brackets
    [0-9]	    Find one character from the range 0 to 9
    */


    // Metacaracteres
    //
    // Los metacaracteres son caracteres con un significado especial:
    //
    // Metacharacter	Description
    // |	            Find a match for any one of the patterns separated by | as in: cat|dog|fish
    // .	            Find just one instance of any character
    // ^	            Finds a match as the beginning of a string as in: ^Hello
    // $	            Finds a match at the end of the string as in: World$
    // \d	            Find a digit
    // \s	            Find a whitespace character
    // \b	            Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
    // \u1234	        Find the Unicode character specified by the hexadecimal number xxxx


    /*
    cuantificadores

    Los cuantificadores definen cantidades:

    Quantifier	Description
    n+	        Matches any string that contains at least one n
    n*	        Matches any string that contains zero or more occurrences of n
    n?	        Matches any string that contains zero or one occurrences of n
    n{x}	    Matches any string that contains a sequence of X n's
    n{x,y}	    Matches any string that contains a sequence of X to Y n's
    n{x,}	    Matches any string that contains a sequence of at least X n's
    */
}
