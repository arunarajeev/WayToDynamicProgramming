//Java Program to Print All Permutations of a String using recursion
public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
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

