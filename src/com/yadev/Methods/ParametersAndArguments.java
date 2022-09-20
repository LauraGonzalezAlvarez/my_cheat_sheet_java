package com.yadev.Methods;

public class ParametersAndArguments {

    /*
    Parameters and Arguments
    Information can be passed to methods as parameter. Parameters act as variables inside the method.

    Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

    The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:
    */
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    /*
    Multiple Parameters
    You can have as many parameters as you like:
    */
    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    /*
    Return Values
    The void keyword, used in the examples above, indicates that the method should not return a value.
    If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    instead of void, and use the return keyword inside the method:
    */
    static int myMethod3(int x) {
        return 5 + x;
    }

    // This example returns the sum of a method's two parameters:
    static int myMethod4(int x, int y) {
        return x + y;
    }

    // You can also store the result in a variable (recommended, as it is easier to read and maintain):
    static int myMethod5(int x, int y) {
        return x + y;
    }

    /*
    A Method with If...Else
    It is common to use if...else statements inside methods:
    */
    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {

        // Parameters and Arguments
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        // Multiple Parameters
        myMethod2("Liam", 5);
        myMethod2("Jenny", 8);
        myMethod2("Anja", 31);
        // Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters and the arguments must be passed in the same order.


        // Return Values
        System.out.println(myMethod3(3));

        // This example returns the sum of a method's two parameters:
        System.out.println(myMethod4(5, 3));

        // You can also store the result in a variable (recommended, as it is easier to read and maintain):
        int z = myMethod5(5, 3);

        System.out.println(z); // Outputs 8 (5 + 3)

        // A Method with If...Else
        checkAge(20); // Call the checkAge method and pass along an age of 20

    }
}
