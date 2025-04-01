// formula: n!/(n-r)!
/* How It Works
The function permute() takes two parameters:
str: The remaining characters.
prefix: The accumulating permutation.
It recursively picks each character, removes it from the string, and adds it to prefix until the string is empty.
Output for "ABC"
objectivec
Copy
Edit
Permutations of ABC:
ABC
ACB
BAC
BCA
CAB
CBA
Handling Larger Strings
For long strings, the number of permutations grows factorially (O(n!) complexity).
 */


public class Recursion_Permutations {
    public static void main(String[] args) {
        String str = "ABB";
        System.out.println("Permutations of " + str + ":");
        permute(str, "");
    }

    public static void permute(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, prefix + ch);
        }
    }
}
