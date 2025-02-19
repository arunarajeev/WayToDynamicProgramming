
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_matchings1 {

    public static void main(String[] args) {

        var tester = new Regex_Test();
        /**
         * // Pattern pattern = Pattern.compile("^...\\....\\....\\....$"); \\WORKS
         * // Pattern pattern = Pattern.compile("^.{3}\\..{3}\\..{3}\\..{3}$"); \\WORKS
         * //Pattern pattern = Pattern.compile("^(.{3}\\.){3}.{3}$");
         */
        /*
         * ^ means starting with
         * $ means ending
         * . used to represent any character other than \n
         * \\. used to represent original dot
         * a{3} means aaa
         */

        // The expression \d matches any digit [ - ].
        // The expression \D matches any character that is not a digit.
        tester.checker("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d"); //

        // \s matches any whitespace character [ \r\n\t\f ].
        // \S matches any non-white space character.
        tester.checker("\\S\\S\\s\\S\\S\\s\\S\\S"); // Use
        // tester.checker("abc");

        // The expression \w will match any word character.
        // \W matches any non-word character.
        // Word characters include alphanumeric characters (a-z, A-Z and 0-9) and
        // underscores (_).
        tester.checker("\\w{3}\\W\\w{10}\\W\\w\\{3}");

        // The ^ symbol matches the position at the start of a string.
        // The $ symbol matches the position at the end of a string.
        tester.checker("^\\d\\w{4}\\.$");

        // The negated character class [^] matches any character that is not in the
        // square brackets.
        /*
         * For the example below, S must be of length 6.
         * First character should not be a digit ( or ).
         * Second character should not be a lowercase vowel ( or ).
         * Third character should not be b, c, D or F.
         * Fourth character should not be a whitespace character ( \r, \n, \t, \f or
         * <space> ).
         * Fifth character should not be a uppercase vowel ( or ).
         * Sixth character should not be a . or , symbol.
         */
        tester.checker("^[^\\d][^\\aeiou][^bcDF][^\\s][^AEIOU][^\\.\\,]$");

        /*
         * A hyphen (-) inside a character class specifies a range of characters
         * where the left and right operands are the respective lower and upper bounds
         * of the range.
         * For example: [1-9] is same as [1,2,3,4,5,6,7,8,9], [a-e] is same as [
         * a,b,c,d,e]
         */
        tester.checker("^[a-z][1-9][^a-z][^A-Z][A-Z]");
        // The {x,y} tool will match between and (both inclusive)
        // repetitions of character/character class/group.
        /*
         * w{3,5} : It will match the character w , or times.
         * [xyz]{5,} : It will match the character x, y or z or more times.
         * \d{1, 4} : It will match any digits , , , or times.
         */
        tester.checker("^\\d{1,2}[a-z,A-Z]{3,}\\.{0,3}$");
        // The * tool will match zero or more repetitions of character/character
        // class/group.
        /*
         * For Example:
         * 
         * w* : It will match the character w 0 or more times.
         * [xyz]* : It will match the characters x, y or z 0 or more times.
         * \d* : It will match any digit 0 or more times.
         */
        tester.checker("^\\d{2,}[a-z]*[A-Z]*$"); // Use \\ instead of using \

        // The + tool will match one or more repetitions of character/character
        // class/group.

        tester.checker("^\\d+[A-Z]+[a-z]+$");

        /*
         * \b assert position at a word boundary.
         * 
         * Three different positions qualify for word boundaries :
         * ► Before the first character in the string, if the first character is a word
         * character.
         * ► Between two characters in the string, where one is a word character and the
         * other
         * is not a word character.
         * ► After the last character in the string, if the last character is a word
         * character.
         */
        /*
         * Example:
         * ou have a test String .
         * Your task is to write a regex which will match word starting with vowel
         * (a,e,i,o, u, A, E, I , O or U).
         * The matched word can be of any length.
         * The matched word should consist of letters (lowercase and uppercase both)
         * only.
         * The matched word must start and end with a word boundary.
         */
        tester.checker("\\b[aeiouAEIOU][a-zA-Z]*\\b");

        /*
         * Parenthesis ( ) around a regular expression can group that part of regex
         * together.
         * This allows us to apply different quantifiers to that group.
         * These parenthesis also create a numbered capturing.
         * It stores the part of string matched by the part of regex inside parentheses.
         * These numbered capturing can be used for backreferences. ( We shall learn
         * about it later )
         */
        /*
         * (?: ) can be used to create a non-capturing group.
         * It is useful if we do not need the group to capture its match.
         * Example: It is (not)? your fault :
         * true for "It is not your fault" and also, "It is your fault"
         */
        // should have or more consecutive repetitions of ok.
        tester.checker("(ok){3}");

        /*
         * Alternations, denoted by the | character, match a single item out of several
         * possible items separated by the vertical bar. When used inside a character
         * class, it will match characters; when used inside a group, it will match
         * entire expressions (i.e., everything to the left or everything to the right
         * of the vertical bar). We must use parentheses to limit the use of
         * alternations.
         */
        /*
         * For example:
         * 
         * (Bob|Kevin|Stuart) will match either Bob or Kevin or Stuart.
         * ([a-f]|[A-F]) will match any of the following characters: a, b, c, d, e, f,
         * A, B, C, D, E, or F.
         */
        tester.checker("^(Mr\\.|Mrs\\.|Ms\\.|Dr\\.|Er\\.)[a-z,A-Z]+$");

        /* \group_number
         * This tool (\1 references the first capturing group) matches the same text as
         * previously matched by the capturing group.
         * For example: (\d)\1: It can match 00, 11, 22, 33, 44, 55, 66, 77, 88 or 99.
         * (\w)(\w)(\w)(\w)y\4\3\2\1 will match malayalam
         */

    }
}

class Regex_Test1 {

    public void checker(String Regex_Pattern) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(line);
        int count = 0;
        while (m.find()) {
            count++;
        }

        System.out.format("Number of matches : %d", count);
    }

}
