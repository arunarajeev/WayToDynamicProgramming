
import java.util.Arrays;

public class L205_IsomorphicStrings {

    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[255];
        int[] m2 = new int[255];

        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));
        return true;
    }
}
