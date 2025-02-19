import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_findASubWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String array[] = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextLine();
        int q = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            String regex = String.format("\\w%s\\w", s);
            Pattern pattern = Pattern.compile(regex);
            int count = 0;
            for (int j = 0; j < n; j++) {
                Matcher matcher = pattern.matcher(array[j]);
                while (matcher.find())
                    count++;
            }
            System.out.println(count);
        }
    }
    /*
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * int n = Integer.parseInt(scanner.nextLine());
     * for(int i=0;i<n;i++){
     * String s = scanner.nextLine();
     * int q= Integer.parseInt(scanner.nextLine());
     * for(int j=0;j<q;j++){
     * String subs = scanner.next();
     * String regex = solveRegex(subs);
     * Pattern p =Pattern.compile(regex);
     * Matcher m = p.matcher(s);
     * int count =0;
     * while(m.find()){
     * count++;
     * }
     * System.out.println(count);
     * }
     * }
     * }
     * 
     * public static String solveRegex(String subs){
     * String regex = String.format("\\w%subs\\w", subs);
     * //String regex="^\\w"+subs+"\\w$";
     * return regex;
     * 
     * }
     */
}
