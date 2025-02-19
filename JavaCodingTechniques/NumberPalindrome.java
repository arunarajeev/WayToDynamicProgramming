
import java.util.ArrayList;
import java.util.List;

public class NumberPalindrome {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int num = 3442443;
        int temp = num;
        
        while (temp > 0) {
           list.add(temp % 10);
            temp /= 10;
        }
        System.out.println("List is:");
        System.out.println(list);
        System.out.println(list.reversed());
        System.out.println(list.equals(list.reversed()));
        System.out.println(isStringPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
    
        if (num > -1 && num < 10)
            return true;
        int temp = num;
        int revNum = 0;
        while (temp > 0) {
            revNum = revNum * 10 + temp % 10;
            temp /= 10;
        }
        if (num == revNum)
            return true;
        return false;
    }

    private static boolean isStringPalindrome(int num) {
        if (num > -1 && num < 10)
            return true;
        StringBuilder numStr = new StringBuilder();
        numStr.append(num);
        String numS = String.valueOf(num);
        if(numS.contentEquals(numStr.reverse().toString()))
            return true;
        return false;
    }
}
