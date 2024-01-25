package sliding_window;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(nums,3));
    }
    public static int longestOnes(int[] nums, int k) {
        int ans = 0;

        int i = 0;
        int j = -1; //j+1 to i-1
        int countWindow = 0;
        while (i < nums.length){
            //acquire
            if (nums[i]==0){
                countWindow++;
                i++;
            }else {
                i++;
            }
            //if invalid j will release value until you are valid
            while (countWindow >k){
                j++;
                if (nums[j]==0){
                    countWindow--;
                }
            }
            //consider
            int sizeOfWindow= i-1-j;
            ans = Math.max(ans,sizeOfWindow);
        }

        return ans;
    }
}
//leetcode 1004