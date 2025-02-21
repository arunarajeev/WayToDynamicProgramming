package Simple;
/* /**
 * Have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable
 * sequence by either returning the string true or false. The str parameter will be composed of + and = symbols
 * with several letters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be
 * surrounded by a + symbol. So the example string would be false.
 * The string will not be empty and will have at least one letter.
 */

import java.util.regex.Pattern;

public class CoderByte_SimpleSymbols {
    public static void main(String[] args) {
        System.out.println(simpleSymbols("==a+==b+===c=="));
    }

    private static boolean simpleSymbols(String str) {
                             
        return Pattern.compile("^([^a-zA-Z]*\\+[a-zA-Z]\\+[^a-zA-Z]*)*$").matcher(str).matches();
    }

}
