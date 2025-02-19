
import java.util.Scanner;

/* Recursion can be solved using 3 criteria: 
1. State - the parameter that is changing 
2:Base condition - the condition that terminates the recurion
3: Transition - or subproblem - calling the next state from the current states*/

 /*  min of f(i+1,x+A[i],y) , f(i+1,x,y+A[i])
1. i 2. i=n return abs(xe2-ye2) return n 3. min of f(i+1,x+A[i],y) , f(i+1,x,y+A[i])
 */
class Recursion_NearbySquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
            }
            long tot_sum = 0;
            for (long num : arr) {
                tot_sum += num;
            }
            System.out.println(f(0, 0, arr, n, tot_sum));
        }
        scanner.close();
    }

    public static long f(int index, long sum_b, long[] arr, int n, long tot_sum) {
        if (index == n) {
            long sum_c = tot_sum - sum_b;
            return Math.abs(sum_b * sum_b - sum_c * sum_c);
        }

        long res1 = f(index + 1, sum_b + arr[index], arr, n, tot_sum);
        long res2 = f(index + 1, sum_b, arr, n, tot_sum);

        return Math.min(res1, res2);
    }

}

    /*My code - almost there.. need to compare 
    public static int minDiff = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] A = {4,5,10,3};
        int x=0, y=0,i=0;
        int n=A.length-1;
        System.out.println(solve(A,i,x,y,n));
    }

    private static int solve(int[] A,int i,int sum_b, int sum_c, int n) {
        if(i==n){
            System.out.println(sum_b+"  "+sum_c);
            return Math.abs((sum_b*sum_b)-(sum_c*sum_c));
        }
        return Math.min(solve(A,i+1,sum_b+A[i],sum_c,n),solve(A,i+1,sum_b,sum_c+A[i],n));
    }*/
