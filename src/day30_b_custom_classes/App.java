package day30_b_custom_classes;

public class App {
    //Instance variables /Fields -----This is not methods
    // INSTANCE Variables / FIELDS  --- NOT method

    String name;
    double version;
    boolean isFree;


    // Build some action/function for this Class / blueprint / template
    // INSTANCE METHOD / NON-STATIC method
    // Each object will run its own version
    // Since run() is INSTANCE method, we cannot call by Class name
    public void run() {
        System.out.println(name + " is running....");
    }


    public void update() {
        System.out.println(name + " is updating....");
        version += 1;

    }
}