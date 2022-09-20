package com.yadev.IfElse;

public class TernaryOperator {

    public static void main(String[] args) {

        // Short Hand If...Else

        // There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

        // It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

        // Instead of writing:
        int time = 20;

        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // You can simply write:
        int time2 = 20;

        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
