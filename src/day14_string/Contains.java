package day14_string;

public class Contains {

    public static void main(String[] args) {

        String str = "Today's Java topic is more methods";

        System.out.println(str.contains("java topic"));
        System.out.println(str.contains("Java topic"));
        System.out.println(str.contains("o")); // it does not check all o's if one matches it executes code

        System.out.println();
        System.out.println(str.contains("ismore"));
        System.out.println(str.contains("is more"));
        System.out.println(str.contains("."));

        System.out.println();
        System.out.println(str.contains("Java , topic, method"));
        System.out.println(str.contains("Java") && str.contains("topic") && str.contains("method"));

        System.out.println(" ");

    }
}
