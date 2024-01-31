package stack;

import java.util.Stack;

public class RemovingStartFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e"; //output : "lecoe"
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack<Character> word = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                word.push(s.charAt(i));
            } else {
                word.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : word) {
            sb.append(c);
        }
        return sb.toString();
    }
}

//Leetcode 2390