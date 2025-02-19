import java.util.HashMap;
import java.util.Map;

class L290_Word_Pattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
/* The put(K key, V value) method in Java's HashMap performs two main actions:

If the key is already present in the map, it updates the key's value and returns the previously associated value.
If the key is not present, it inserts the new key-value pair and returns null. */
    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
            Map<Object, Integer> index = new HashMap<>();
        for (Integer i = 0; i < words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }
}
