package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        /*
    Data Types:
        1) Primitive
            a) Integer Type         - byte, short, int, long
            b) Floating Type        - float, double
            c) Single characters    - char
            d) true/false           - boolean
        2) Non-Primitive
            * Sequence of chars     - String
 */


        byte age = 34;             // Declared a variable  called age and datatype is byte and assigned a value 34;
        System.out.println("age"); // age is not variable name. It is a value itself of String datatype
        System.out.println(age); // age is a variable here. --> datatype is byte
        System.out.println(34); // 34 is value and By DEFAULT it is int datatype because it is a whole number

        // byte b2 = 200; //This will cause an error because byte can only hold from -128-127. 200 is big for this container

        short year;          // Declare a variable called year and datatype is short
        year =2024;          // We assigned a value of 2024 to the variable called
        System.out.println(year); // year is a variable here.Datatype is ---> short
        System.out.println(2024); // 2024 is a value and BY DEFAULT whole number are --> int

        System.out.println("-------------");

        int ipNumber = 123456;        // Declared a variable called ipNumber and datatype is int
        System.out.println(ipNumber); // ipNumber is a variable and datatype is ---->int
        System.out.println(123456);   // 123456 is a value BY DEFAULT whole numbers are ---> int

        System.out.println("--------------");

        long accNumber = 1234567812345678L;  // Declared a variable called accNumber and datatype is  --- > long and assigned a value directly with having "L" or "l" at the end of the value
        System.out.println(accNumber);


    }
}
