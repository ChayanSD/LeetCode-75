package arrays_strings;

import java.util.Arrays;

public class TripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= minValue) {
                minValue = n;
            } else if (n <= maxValue) {
                maxValue = n;
            } else return true;
        }
        return false;
    }
}

//Leetcode 334