package Simple;
/* /**
 * Have the function ABCheck(str) take the str parameter being passed and return the string true if the
 * characters a and b are separated by exactly 3 places anywhere in the string at least once
 * (ie. "lane borrowed" would result in true because there is exactly three characters between a and b).
 * Otherwise return the string false.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class CoderByte_ABCheck {

public static boolean abCheck(String str) {
    return Pattern.compile("[aA].{3}[bB]").matcher(str).find();
    }    
    public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(abCheck(s.nextLine())); 
  }
}
