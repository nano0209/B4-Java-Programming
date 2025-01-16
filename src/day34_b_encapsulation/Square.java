package day34_b_encapsulation;
//Template class - set the instructor for each object and class itself how to behave
/*
create a class called Square
    -data:
     side
 */


public class Square {
    // Instance Variable
    private int side;

    // Constructor
    public Square (int side) {
        //this.side = side;
        setSide(side);
    }


    // instance SETTER method for side instance variable.
    // WRITE the info
    public void setSide(int side) {
        if(side > 0){
            this.side = side;
        }
    }


    // instance GETTER method for side instance variable
    // READ the into
    public int getSide () {
        return side;
    }


    // Instance method - calculateArea
    public int calculateArea () {
        int result = side * side;
        return result;
    }

    // Instance method - calculatePerimeter
    public int calculatePerimeter () {
        // return side + side + side + side;
        return 4 * side;
    }

    public String toString() {
        String message = "";
        message = "Info about the Square: " +
                "\n\tSide: " + side +
                "\n\tArea: " + calculateArea() +
                "\n\tPerimeter: " + calculatePerimeter();
        return message;
    }






}
