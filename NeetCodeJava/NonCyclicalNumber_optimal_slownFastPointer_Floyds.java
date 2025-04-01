package NeetCodeJava;

public class NonCyclicalNumber_optimal_slownFastPointer_Floyds {
    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit; // Faster than Math.pow()
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int slow = n, fast = getSumOfSquares(n); // Initialize slow and fast pointers

        while (fast != 1 && slow != fast) {
            slow = getSumOfSquares(slow); // Move slow pointer one step
            fast = getSumOfSquares(getSumOfSquares(fast)); // Move fast pointer two steps
        }

        return fast == 1; // If fast reaches 1, it's a happy number
    }

    public static void main(String[] args) {
        System.out.println(isHappy(100)); // Output: true
        System.out.println(isHappy(101)); // Output: false
    }
}