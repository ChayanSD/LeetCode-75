package arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class KidsCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> res = kidsWithCandies(candies,extra);
        System.out.println(res);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //Finding the max candies
        //check candies of i + extraCandies > = max return true;
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max){
                max= candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if((candies[i] + extraCandies) >= max){
              result.add(true);
            }else {
                result.add(false);
            }
        }

        return result;
    }
}

//Leetcode 1431