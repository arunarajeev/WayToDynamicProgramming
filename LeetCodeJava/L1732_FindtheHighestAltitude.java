

/* There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 

Constraints:

n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100*/
class L1732_FindtheHighestAltitude {

    public static void main(String[] args) {
        int[] arr = {52,-91,72};
        //[0,-5,-4,1,1,-6]
        System.out.println(largestAltitude(arr));
    }

//This code beats 100% in runtime and 86% in memory
    public static int largestAltitude(int[] gain) {

        int high = 0;
        int len = gain.length;
        int[] altArr = new int[len + 1];
        altArr[0] = 0;
        for (int i = 0; i < len; i++) {
            altArr[i + 1] = altArr[i] + gain[i];
            System.out.print(altArr[i+1] + "  ");
            if (altArr[i+1] > high) {
                high = altArr[i+1];
            }
        }
        return high;
    }
}
