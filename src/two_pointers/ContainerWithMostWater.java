package two_pointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
    int result = 0;
    int li = 0;
    int ri = height.length -1;

    while (li < ri){
        int left = height[li];
        int right = height[ri];

        int area = Math.min(left,right) *(ri - li);
        result = Math.max(result,area);
        if (left <right){
            li++;
        }else {
            ri--;
        }
    }
return result;
    }
}
