import java.util.Scanner;
import java.util.regex.Pattern;

class HackerRank_IPAddress {

    private static final String IPV4_PATTERN = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
            + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    private static final String IPV6_PATTERN = "^(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})$";

    private static final Pattern IPV4_REGEX = Pattern.compile(IPV4_PATTERN);
    private static final Pattern IPV6_REGEX = Pattern.compile(IPV6_PATTERN);

    public static String validateIPAddress(String ip) {
        if (IPV4_REGEX.matcher(ip).matches()) {
            return "IPv4";
        } else if (IPV6_REGEX.matcher(ip).matches()) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            System.out.println(validateIPAddress(line));
        }

        scanner.close();
    }
}
