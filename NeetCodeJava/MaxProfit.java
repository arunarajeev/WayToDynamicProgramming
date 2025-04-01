package NeetCodeJava;

public class MaxProfit {
    public static int maxProfit(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxProfit)
                    maxProfit = prices[j] - prices[i];
            }
        }
        if (maxProfit > 0)
            return maxProfit;
        return 0;
    }
//optimal solution using 2 pointer
    public static int maxProfit1(int[] prices) {
        int l = 0, r = 1;
        int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] prices = { 10, 1, 5, 6, 7, 1 };
        System.out.println(maxProfit1(prices));
    }
}
