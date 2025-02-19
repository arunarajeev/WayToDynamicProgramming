import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_matchings2 {

    public static void main(String[] args) {

        
        /*
         * \group_number
         * This tool (\1 references the first capturing group) matches the same text as
         * previously matched by the capturing group.
         * For example: (\d)\1: It can match 00, 11, 22, 33, 44, 55, 66, 77, 88 or 99.
         * (\w)(\w)(\w)(\w)y\4\3\2\1 will match malayalam
         */
        /*
         * S must be of length: 20
         * character: lowercase letter.
         * character: word character.
         * character: whitespace character.
         * character: non word character.
         * character: digit.
         * character: non digit.
         * character: uppercase letter.
         * character: letter (either lowercase or uppercase).
         * character: vowel (a, e, i , o , u, A, E, I, O or U).
         * character: non whitespace character.
         * character: should be same as 1st character.
         * character: should be same as 2nd character.
         * character: should be same as 3rd character.
         * character: should be same as 4th character.
         * character: should be same as 5th character.
         * character: should be same as 6th character.
         * character: should be same as 7th character.
         * character: should be same as 8th character.
         * character: should be same as 9th character.
         * character: should be same as 10th character.
         */
       
            String regex1 =    "^([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([a-z,A-Z])([aeiouAEIOU])(\\S)\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10$";

        /*
         * Backreference to a capturing group that match nothing is different from
         * backreference to a capturing group that did not participate in the match at
         * all.
         * Here, b? is optional and matches nothing.
         * Thus, (b?) is successfully matched and capture nothing.
         * o is matched with o and \1 successfully matches the nothing captured by the
         * group.
         * n most regex flavors (excluding JavaScript), (b)?o\1 fails to match o.
         * Here, (b) fails to match at all. Since, the whole group is optional the regex
         * engine does proceed to match o.
         * The regex engine now arrives at \1 which references a group that did not
         * participate in the match attempt at all.
         * Thus, the backreference fails to match at all.
         * 
         * Task
         * 
         * You have a test string .
         * Your task is to write a regex which will match , with following condition(s):
         * 
         * consists of 8 digits.
         * may have "" separator such that string gets divided in parts, with each part
         * having exactly two digits. (Eg. 12-34-56-78)
         * 
         * Valid
         * 12345678
         * 12-34-56-87
         * 
         * Invalid
         * 1-234-56-78
         * 12-45-7810
         */
        String regex2 = "^\\d{2}(-?)(\\d{2}\\1){2}\\d{2}$";

        /*
         * NOTE - Forward reference is supported by JGsoft, .NET, Java, Perl, PCRE, PHP,
         * Delphi and Ruby regex flavors.
         * 
         * Forward reference creates a back reference to a regex that would appear
         * later.
         * Forward references are only useful if they're inside a repeated group.
         * Then there may arise a case in which the regex engine evaluates the
         * backreference after the group has been matched already.
         * ou have a test string .
         * Your task is to write a regex which will match , with following condition(s):
         * 
         * consists of tic or tac.
         * tic should not be immediate neighbour of itself.
         * The first tic must occur only when tac has appeared at least twice before.
         * Valid
         * 
         * tactactic
         * tactactictactic
         * Invalid
         * 
         * tactactictactictictac
         * tactictac
         */
        String regex = "^(\\2tic|(tac))+$";


        
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        // ^(\\2tic|(tac))+$
        Pattern p =Pattern.compile(regex);
        Matcher m = p.matcher(str);
        System.out.println(m.find());
    }
}
