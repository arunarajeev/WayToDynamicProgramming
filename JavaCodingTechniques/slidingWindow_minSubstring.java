
import java.util.HashMap;

public class slidingWindow_minSubstring {

    public static void main(String[] args) {
        String str = "yhadcfgbarcthctybcika";
        String sub = "bca";
        System.out.println(minSubstring(str, sub));
    }

    private static String minSubstring(String str, String sub) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sub.length(); i++) {
            char c = sub.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int reqChars = sub.length();
        for (int right = 0; right < str.length(); right++) {
            char rightCh = str.charAt(right);
            if (map.containsKey(rightCh)) {
                if (map.get(rightCh) > 0) {
                    reqChars--;
                }
                map.put(rightCh, map.get(rightCh) - 1);
            }
            /*
             * if(reqChars==0){
             * minLen = right - left +1;
             * break;
             * }
             */
            while (reqChars == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftCh = str.charAt(left);
                if (map.containsKey(leftCh)) {
                    map.put(leftCh, map.get(leftCh) + 1);
                    reqChars++;
                }
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE ? "" : str.substring(minStart, minStart + minLen));
    }
}
