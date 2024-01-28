package hash_map_set;
import java.util.*;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);

        }

        Set<Integer> s = new HashSet<>();
        for (int x : map.values()) {
            s.add(x);
        }

        return map.size() == s.size();
    }
}
