package day16_loops;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a URL: ");
        String url = scan.next();

        url = url.substring(  url.indexOf(".")+1, url.lastIndexOf(".")  );
        //url.substring(  3, 10  );  ---- >  .google
        System.out.println(url);

        /*
            TODO: Home Practice
                Make sure that URL starts with www. AND ends with .com
                If not ---- > print "My code is not designed to handle your URL"
                If it is -- > do what the task says

         */




    }
}
