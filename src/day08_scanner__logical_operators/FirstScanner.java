package day08_scanner__logical_operators;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {
        // Scanner input; --- > input is the object reference name (because data type is NON-PRIMITIVE / OBJECT type)
        // int a;         --- > a is variable name (because data type is PRIMITIVE datatype)

        // #2 - Declaring and instantiating Scanner Object  --- > will help us to get the info from the user/console
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you? ");
        //int userAge = 30; // HARDCODED value given to userAge
        int userAge = input.nextInt();
        System.out.println("I am " + userAge + " years old.");
    }
}
