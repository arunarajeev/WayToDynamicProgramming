

/* You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.

 

Example 1:

Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
Example 2:

Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation: 
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
 

Constraints:

1 <= logs.length <= 100
1950 <= birthi < deathi <= 2050 */
class L1854_MaximumPopulationYear {

    public static void main(String[] args) {
        //int[][] logs = {{1982, 1998}, {2013, 2042}, {2010, 2035}, {2022, 2050}, {2047, 2048}};
       // int[][] logs = {{2000,2001}};
        int[][] logs = {{2033, 2034}, {2039, 2047}, {1998, 2042}, {2047, 2048}, {2025, 2029}, {2005, 2044}, {1990, 1992}, {1952, 1956}, {1984, 2014}};
        System.out.println(maximumPopulation(logs));
    }


    public static int maximumPopulation(int[][] logs) {
        int maxbirth = 0;
        int[] arr = new int[2051];
        for (int[] pop : logs) {
            arr[pop[0]]++;
            arr[pop[1]]--;
        }
        int temp = 0;
        int year = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (temp > maxbirth) {
                maxbirth = temp;
                year = i;

            }
        }
        return year;

    }

}
