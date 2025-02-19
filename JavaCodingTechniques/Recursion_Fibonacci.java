/* Recursion can be solved using 3 criteria: 
1. State - the parameter that is changing 
2:Base condition - the condition that terminates the recurion
3: Transition - or subproblem - calling the next state from the current states*/

 /* Fibonacci: f(n) = f(n-1) + f(n-2)
1. n 2. n=1 or n=0, return n 3. f(n-1) + f(n-2)
 */
class Recursion_Fibonacci {

    public static void main(String[] args) {

        System.out.println(fib(10));

    }

    private static int fib(int n) {

        if (n < 2) {
            return n;
        }
        return fib(n-1) + fib(n - 2);
    }
}
