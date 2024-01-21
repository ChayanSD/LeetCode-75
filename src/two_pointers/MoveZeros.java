package two_pointers;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
       moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (i < nums.length){
            if (nums[i]==0){
                i++;
            }else {
                swap(nums,i,j);
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int [] nums ,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b]= temp;
    }

}

//Leetcode 283