package arrays_strings;

public class CommonDivisorOfStrings {
    public static void main(String[] args) {
        String s = "ABCABC";
        String b = "ABC";
        System.out.println(gcdOfStrings(s, b));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

//Leetcode 1071