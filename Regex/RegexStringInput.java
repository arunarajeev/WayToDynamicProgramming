import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStringInput {

    public static String input() {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        return str;
    }

    public static int patternMatchCount(String str, String regexStr) {
        Pattern p = Pattern.compile(regexStr);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find())
            count++;
        return count;
    }
}
