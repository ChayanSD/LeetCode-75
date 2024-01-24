package sliding_window;

public class MaxAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findAverage(nums, k));
    }

    public static double findAverage(int[] nums, int k) {
        //define the sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        //Start the sliding window
        int startIndex = 0;
        int endIndex = k;

        while (endIndex < nums.length){
            //remove the previous element
            sum -= nums[startIndex];
            startIndex++;

            //add the next element
            sum += nums[endIndex];
            endIndex++;

            //update the sum
            maxSum = Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
    }
}


//Leetcode 643