public class HackerRank_StairCase {

    public static void staircase(int n) {
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k <space; k++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("#");
            System.out.println();
            space--;
        }
    }

    public static void staircaseRegex(int n) {
        String message = "";
        for(int i=1; i<=n;i++){
            message += "#";
            System.out.printf("%"+n+"s\n", message);
        }
    }
    
    public static void main(String[] args) {
        staircase(5);
        System.out.println();
        staircaseRegex(5);
    }
}
