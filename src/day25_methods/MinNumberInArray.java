package day25_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {

        int [] nums = {23, 345, 1356, 765, 2344, 2};
        System.out.println(minNumber(nums));
        System.out.println(ArrayUtil.minNumber(nums));


    }
    public static int minNumber(int [] arr){
        int min = 0;
        Arrays.sort(arr);

        min = arr[0];
        return min;

    }
}
