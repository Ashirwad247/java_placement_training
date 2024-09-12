import java.util.*;

public class one {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];  // Array to store the count of each character

            // Count the frequency of each character in the string
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // Convert the count array to a string key (or use Arrays.toString())
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                // sb.append('#');  // Any delimiter to separate the counts
                sb.append(i);
            }
            String key = sb.toString();
            System.out.println(key);

            // Group the strings with the same character counts
            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        one ga = new one();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ga.groupAnagrams(strs));
    }
}
