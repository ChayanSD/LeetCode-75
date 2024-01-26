package sliding_window;

public class LongestSubarray {
    public static void main(String[] args) {
        int [] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int ans = 0;

        int i = 0;
        int j = -1;
        int countWindow = 0;


        while (i < nums.length){
            //acquire
            if (nums[i]==1){
                i++;
            }else {
                i++;
                countWindow++;
            }
            //if invalid j will release value until you are valid
            while (countWindow >1 && j<i){
                j++;
                if (nums[j]==0){
                    countWindow--;
                }
            }
            //consider
            int sizeOfWindow= i-j-1;
            ans = Math.max(ans,sizeOfWindow);
        }
        return ans -1;
    }
}
//Leetcode 1493