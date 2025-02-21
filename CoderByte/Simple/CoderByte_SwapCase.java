package Simple;
public class CoderByte_SwapCase {

    public static void main(String[] args) {
        System.out.println(swapCase("jh$%bJHgji666HdRkO68ld"));
        System.out.println(swapCaseUsingBuiltIn("jh$%bJHgji666HdRkO68ld"));
    }

    private static String swapCaseUsingBuiltIn(String str) {
        String swap = "";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLowerCase(str.charAt(i))) {
                swap += Character.toUpperCase(str.charAt(i));
            } else if (Character.isUpperCase(str.charAt(i))) {
                swap += Character.toLowerCase(str.charAt(i));
            } else {
                swap += str.charAt(i);
            }
        }
        return swap;
    }

    private static String swapCase(String str) {
        String swap = "";
        for (int i = 0; i < str.length(); i++) {
            int ascii = Integer.valueOf(str.charAt(i));
            if (ascii >= 65 && ascii <= 90) {
                swap += (char) (ascii + 32);
            } else if (ascii >= 97 && ascii <= 122) {
                swap += (char) (ascii - 32);
            } else {
                swap += str.charAt(i);
            }
        }
        return swap;
    }

    // using islower and toUpper

}
