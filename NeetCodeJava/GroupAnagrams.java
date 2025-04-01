package NeetCodeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String args[]) {
        // Input: strs = ["act","pots","tops","cat","stop","hat"]
        // Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagrams(strs));

    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        for (String s:strs) {
            int[] alphabetArray = new int[26];
            for (char c : s.toCharArray()) {
                alphabetArray[c - 'a']++;
            }
            String key = Arrays.toString(alphabetArray);
            resultMap.putIfAbsent(key, new ArrayList<>());       
            resultMap.get(key).add(s);
        }
        return new ArrayList<>(resultMap.values());
    }
}
