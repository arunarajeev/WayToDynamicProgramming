package NeetCodeJava;

import java.util.HashSet;

public class NonCyclicalNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while (n != 1 && !set.contains(n)) {  // Continue until n becomes 1 or repeats
            set.add(n);
            int sum = 0;
            while (n > 0) {  // Calculate sum of squares of digits
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum; // Update n to new computed sum
        }  
        return n == 1; // If we exit with n == 1, it's a happy number
    }
    

    public static void main(String[] args) {
        System.out.println(isHappy(101));
    }
}
