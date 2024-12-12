package day25_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {
        int [] nums = {23, 4, 56, 78, 24};
        System.out.println(ArrayUtil.minNumber(nums));

        System.out.println(ArrayUtil.maxNumber(nums));

        System.out.println(ArrayUtil.contains(nums, 78));

        if (ArrayUtil.contains(nums, 80)) {
            System.out.println("Array contains that number");
        } else {
            System.out.println("Array does not contain that number");
        }
    }
}
