package medium;

/**
 * Using the Java language, have the function CoinDeterminer(num) take the
 * input,
 * which will be an integer ranging from 1 to 250,
 * and return an integer output that will specify the least number of coins,
 * that when added, equal the input integer. Coins are based on a system as
 * follows:
 * there are coins representing the integers
 * 1, 5, 7, 9, and 11. So for example: if num is 16,
 * then the output should be 2 because you can achieve the
 * number 16 with the coins 9 and 7. If num is 25,
 * then the output should be 3 because you can achieve 25 with
 * either 11, 9, and 5 coins or with 9, 9, and 7 coins.
 */
public class CoinDeterminer {
    static int coins;

    CoinDeterminer() {
        coins = 0;
    }

    public static void main(String[] args) {
        System.out.println(coinDeterminer(16));  // Output: 2 (9 + 7)
        System.out.println(coinDeterminer(25));  // Output: 3 (11 + 9 + 5)
    }

    //Dynamic programming - chatGPT
    public static int coinDeterminer(int num) {
        // Define the coin denominations
        int[] coins = {1, 5, 7, 9, 11};
        
        // Initialize dp array with a large value
        int[] dp = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            dp[i] = Integer.MAX_VALUE;  // Start with a large value
        }
        dp[0] = 0; // Base case: 0 coins are needed to make 0
        
        // Iterate through each coin
        for (int coin : coins) {
            // Update the dp array for each value from coin to num
            for (int i = coin; i <= num; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {  // Check if previous value is reachable
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);  // Choose the minimum coins needed
                }
            }
        }

        // The answer will be in dp[num]
        return dp[num];
    }
    //the following solution doesn't give the least number of coins needed
    private static void coinDeterminer1(int n) {
        int[] denominations = {11,9,7,5,1};

        for(int divisor:denominations){
            coins += n / divisor;
            n= n - (n/divisor)*divisor;
        }
        System.out.println(coins);
    }
}


