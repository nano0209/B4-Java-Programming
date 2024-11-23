package day18_loops;
import java.util.Scanner;
/*
    repeated actions
        -ask the user to enter the item
        -add item to the shopping list
        -ask user if they want to add more items.

    At the end show the whole item list
 */

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // String userItem = "";
        String shoppingList = "Your shopping list items ";
        String userAnswer = "";

        do {
            System.out.println("Please enter the name of the item? ");
            shoppingList = shoppingList + "\n\t " + scanner.nextLine();
            System.out.println("Do you want to add more items (yes/no): ");
            userAnswer = scanner.nextLine();


        }while (userAnswer.equalsIgnoreCase("yes")); // as long as user says , I want to continue

        System.out.println(shoppingList);

    }

}
