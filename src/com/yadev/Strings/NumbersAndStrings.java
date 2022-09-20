package com.yadev.Strings;

public class NumbersAndStrings {

    public static void main(String[] args) {

        // Adding Numbers and Strings
        //WARNING!

        //Java uses the + operator for both addition and concatenation.

        //Numbers are added. Strings are concatenated.

        //If you add two numbers, the result will be a number:
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)

        // If you add two strings, the result will be a string concatenation:
        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1;  // z will be 1020 (a String)

        // If you add a number and a string, the result will be a string concatenation:
        String x3 = "10";
        int y3 = 20;
        String z3 = x3 + y3;  // z will be 1020 (a String)


    }
}
