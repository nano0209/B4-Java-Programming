package day27_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {

        String searchResultInfo = "About 558,000,000 results (0.29 seconds)";
        searchResultInfo = searchResultInfo.replace("(", "").replace(")", "");
        String[] resultInArr = searchResultInfo.split(" ");  // ["About", "558,000,000", "results", "0.29", "seconds"]
        String time = resultInArr[resultInArr.length - 2]; // > [resultInArr.length-2 ]
        System.out.println(time);

        double time1 = Double.parseDouble(time); // Converts String to double (primitive)
        // Double time2 = Double.valueOf(time); // Converts String to Double (wrapper class object)


        if (time1 < 0.5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // We just did the code line below to practice teh TERNARY -- it does the same thing as if-else code above
        System.out.println(time1 < 0.5 ? "Pass" : "Fail");
    }
    }
