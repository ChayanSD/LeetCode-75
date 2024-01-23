package two_pointers;

import java.util.Arrays;

public class KSumPair {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums,k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0, i =0, j= nums.length -1;
        while(i<j)
            if(nums[i]+nums[j] > k){
                j--;
            }
            else if(nums[i]+nums[j] < k){
                i++;
            }
            else {
                i++;
                j--;
                result++;
            }
        return result;
    }
}
//Leetcode 1679
//Input: nums = [3,1,3,4,3], k = 6
//Output: 1