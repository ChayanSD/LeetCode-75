package arrays_strings;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while (left < right){
          char leftChar = arr[left];
          char rightChar = arr[right];

          if (isVowel(leftChar) && isVowel(rightChar)){
            //swap
              arr[left] = rightChar;
              arr[right] = leftChar;
              left++;
              right --;
          }else if (isVowel(leftChar)){
                right --;
          }else if (isVowel(rightChar)){
                left++;
          }else {
              left ++;
              right --;
          }
        }

    return new String(arr);
    }

   static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A') {
            return true;
        } else if (ch == 'e' || ch == 'E') {
            return true;
        } else if (ch == 'i' || ch == 'I') {
            return true;
        } else if (ch == 'o' || ch == 'O') {
            return true;
        } else if (ch == 'u' || ch == 'U') {
            return true;
        }
        return false;
    }
}

//Leetcode 345
