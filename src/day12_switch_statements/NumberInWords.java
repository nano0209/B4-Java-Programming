package day12_switch_statements;

public class NumberInWords {
    public static void main(String[] args) {

        int num = 3; //1 -5 it is not in the rage of 1-5

        if (num >=1 && num <= 5){

            if (num == 1){
                System.out.println("One");

            } else if (num == 2) {
                System.out.println("Two");

            }else if (num == 3){
                System.out.println("Three");
            } else if (num == 4) {
                System.out.println("Four");

            }else {
                System.out.println("Five");
            }

        }else {
            System.out.println("It is not in the rage of 1-5");
        }
    }
}
