package day15_string;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = key.nextLine();

        System.out.println(sentence.charAt(0)); // This is not CONCATENATION, or ADDITION. So prints normally
        System.out.println(0 + sentence.charAt(0)); // This is not CONCATENATION, but ADDITION. So prints there calculation 0 + 74 (ASCII table number for J)
        System.out.println(sentence.charAt( sentence.length() - 1 )); // This is not CONCATENATION, or ADDITION. So prints normally
        System.out.println(0 + sentence.charAt( sentence.length() - 1 )); // This is not CONCATENATION, but ADDITION. So prints there calculation 0 + 101 (ASCII table number for e)


        System.out.println();
        System.out.println("First char: " + sentence.charAt(0)); // This is CONCATENATION
        System.out.println("Last char: " + sentence.charAt(  sentence.length() - 1 )); // This is CONCATENATION



    }
}