/* Look-and-Say sequence is a coding challenge that involves generating rows based on the previous row. 
Example of the Look-and-Say sequence 
Start with the number 1, which produces 11
Starting with 11, you have two 1's, which produces 21
Starting with 21, you have one 2, then one 1, which produces 1211 */

package medium;

public class LookSaySequence {
    public static void main(String[] args) {
        System.out.println(generateSequence(412233));
    }

    private static int generateSequence(int n) {
        String s = "";
        if(n<10 && n>-1){
            return Integer.valueOf("1"+n);
        }

        int digit = Integer.MAX_VALUE;
        int prevDigit = n % 10;
        int count = 1;
        n=n/10;
        // 11->21 21->1211
        while (n > 0 || prevDigit != digit) {
            digit = n % 10;
            n = n / 10;
            if (prevDigit != digit) {
                s=count+""+prevDigit+""+s;
                prevDigit = digit;
                count = 1;
            } else {
                count++;
            }
        }
        if (prevDigit != digit) {
            s=count+""+prevDigit+""+s;
        }
        else{
            s=count+""+digit+""+s; 
        }

        return Integer.valueOf(s);
    }

}
