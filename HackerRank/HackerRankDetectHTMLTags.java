import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankDetectHTMLTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("< *(\\w+)[^>]*>");
        SortedSet<String> ans = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            while (matcher.find()) {
                ans.add(matcher.group(1));
            }
        }
        System.out.println(ans);
        System.out.println(String.join("+", ans));
    }

}