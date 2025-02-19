/* Recursion can be solved using 3 criteria: 
1. State - the parameter that is changing 
2:Base condition - the condition that terminates the recurion
3: Transition - or subproblem - calling the next state from the current states*/

 /* Factorial: f(n) = n * f(n-1)
1. n 2. n=1 return n 3. f(n) = n * f(n-1)
 */
class Recursion_Factorial {

    public static void main(String[] args) {

        System.out.println(fact(5));

    }

    private static int fact(int n) {

        if (n < 2) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
