package arrays_strings;



public class StringCompression {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'b', 'c'};
        System.out.println(compress(ch));
    }

    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        int count = 1;
        sb.append(chars[0]);

        while (i < chars.length) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }

                sb.append(chars[i]);
                count = 1;
            }
            i++;
        }
        if (count > 1) {
            sb.append(count);
        }
//change the original array
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        System.out.println(sb);
        return sb.length();
    }
}
