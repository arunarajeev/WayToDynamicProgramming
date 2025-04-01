package NeetCodeJava;

public class MaxProfit_practice1 {

    // optimal solution using 2 pointer
    public static int maxProfit2(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int left = 0;
        int right = 1;
        int maxP = 0;

        while(right<prices.length-1){
            if(prices[left]<prices[right]){
                maxP=Math.max(maxP,prices[right]-prices[left]);
            }
            else{
                left=right;
            }
            right++;
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] prices = { 5,2,1,3,4,2};
        System.out.println(maxProfit2(prices));
    }
}
