package my_utilities;
import java.util.Arrays;

public class ArrayUtil {
    /**
     * This method returns the minimum value in the given int array
     */
    public static int minNumber(int[] arr) {
        int min = 0;
        Arrays.sort(arr);

        min = arr[0];
        return min;


    }

    /**
     * This method returns the maximum value in the given int array
     */

    public static int maxNumber(int[] arr) {
        int max = 0;
        Arrays.sort(arr);

        max = arr[arr.length - 1];
        return max;


    }


    /**
     * This method returns boolean whether given int arr contains the given num
     * @param arr given array
     * @param num given num
     * @return boolean whether contains or not
     */

    public static boolean contains(int [] arr, int num){
        boolean result = false;

        for (int each : arr){
            if (each == num){
                result = true;
                break;
            }
        }

        return result;

    }
}