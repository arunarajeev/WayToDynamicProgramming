/* How It Works
Sorting: We first sort the string to bring duplicate characters together.
Backtracking: We use recursion to generate permutations.
Duplicate Handling: We skip a character if it's the same as the previous one and 
the previous one hasn’t been used in that iteration.
Example Output for "AAB"
sql
Copy
Edit
Unique permutations of AAB:
AAB
ABA
BAA
Without duplicate handling, we would have gotten 6 permutations instead of 3. */

import java.util.Arrays;

public class UniqueStringPermutations {
    public static void main(String[] args) {
        String str = "ABB";
        System.out.println("Unique permutations of " + str + ":");
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray); // Sort to ensure duplicate handling
        permute(charArray, new boolean[charArray.length], new StringBuilder());
    }

    public static void permute(char[] str, boolean[] used, StringBuilder current) {
       
        System.out.println(Arrays.toString(str) + " ->  " + Arrays.toString(used) + " -> " + String.valueOf(current));
       
        if (current.length() == str.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < str.length; i++) {
            // Skip used characters
            if (used[i])
                continue;

            // Skip duplicate characters (important condition)
            if (i > 0 && str[i] == str[i - 1]&& !used[i - 1])
                continue;

            used[i] = true;
            current.append(str[i]);
            permute(str, used, current);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}
