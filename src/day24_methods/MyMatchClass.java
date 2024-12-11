package day24_methods;

public class MyMatchClass {
    public static void main(String[] args) {

        addition(12, 34);
        addition(50, 100);
        subtraction(20, 50);
        subtraction(55, 15);

        multiplication(2, 4);
        division(10, 2);
    }
    public static void addition (int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
    public static void subtraction (int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplication (int num1, int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

    }

    public static void division (int num1, int num2){
        if (num2 == 0){
            System.out.println("Not divisible by 0");
        }else
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
