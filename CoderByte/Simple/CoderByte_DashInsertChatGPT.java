package Simple;
public class CoderByte_DashInsertChatGPT {

    public static void main(String[] args) {
        String input = "A35B34C5ff7ds9853dfg";
        String result = dashInsert(input);
        System.out.println(result); // Output: A3-5B34C5ff7ds985-3dfg
    }

    public static String dashInsert(String str) {
        // StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        // Traverse through the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // If the current character is a digit
            if (Character.isDigit(currentChar)) {
                // If the current digit is odd
                if ((currentChar - '0') % 2 != 0) {
                    // If it's not the first character and the previous character is an odd digit, 
                    //insert a dash
                    if (i > 0 && Character.isDigit(str.charAt(i - 1)) && (str.charAt(i - 1) - '0') % 2 != 0) {
                        result.append('-');
                    }
                }
            }
            result.append(currentChar); // Non-digit characters are added directly to result
        }
        return result.toString(); // Convert the StringBuilder to string and return
    }
}