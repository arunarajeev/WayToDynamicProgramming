package Simple;

/* Bracket Combinations
Have the function BracketCombinations(num) read num which will 
be an integer greater than or equal to zero, and return the number 
of valid combinations that can be formed with num pairs of parentheses. 
For example, if the input is 3, then the possible combinations
 of 3 pairs of parenthesis, 
 namely: ()()(), are ()()(), ()(()), (())(), ((())), and (()()).
  There are 5 total combinations when the input is 3, so your program should return 5.
Examples
Input: 3
Output: 5
Input: 2
Output: 2 
combinatorics : Catalan number formula:  
(2n)!/(n+1)!n!
*/
import java.util.*;

class CoderByte_BracketCombinations {

    public static int BracketCombinations(int num) {
        return ((fact(2*num))/(fact(num+1)*fact(num)));
    }

    private static int fact(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print(BracketCombinations(s.nextInt()));
    }

}
