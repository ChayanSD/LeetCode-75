package two_pointers;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "xyz", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length){
            if (a[i]==b[j]){
                i++;
                j++;
            }else if (a[i] != b[j]){
                j++;
            }
        }

        return i==a.length;
    }
}

//Leetcode 392