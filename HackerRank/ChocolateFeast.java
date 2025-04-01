public class ChocolateFeast {
    public static void main(String[] args) {

        System.out.println(chocolateFeast(13, 2, 3));
    }

    public static int chocolateFeast(int credit, int chocCost, int promoWrappers) {
        int chocolates = credit / chocCost;  // Initial chocolates bought
        int wrappers = chocolates;           // Initial wrappers from chocolates

        while (wrappers >= promoWrappers) {
            int freeChocolates = wrappers / promoWrappers; // Chocolates from wrappers
            chocolates += freeChocolates;  // Add free chocolates to total
            wrappers = freeChocolates + (wrappers % promoWrappers); // Remaining wrappers
        }

        return chocolates;
    }
}