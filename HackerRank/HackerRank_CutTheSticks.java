/*You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.

Given the lengths of  sticks, print the number of sticks that are left before each iteration until there are none left.

Example

The shortest stick length is , so cut that length from the longer two and discard the pieces of length . Now the lengths are . Again, the shortest stick is of length , so cut that amount from the longer stick and discard those pieces. There is only one stick left, , so discard that stick. The number of sticks at each iteration are .

Function Description

Complete the cutTheSticks function in the editor below. It should return an array of integers representing the number of sticks before each cut operation is performed.

cutTheSticks has the following parameter(s):

int arr[n]: the lengths of each stick
Returns

int[]: the number of sticks after each iteration
Input Format

The first line contains a single integer , the size of .
The next line contains  space-separated integers, each an , where each value represents the length of the  stick.

Constraints

Sample Input 0

STDIN           Function
-----           --------
6               arr[] size n = 6
5 4 4 2 2 8     arr = [5, 4, 4, 2, 2, 8]
Sample Output 0

6
4
2
1
Explanation 0

sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE
Sample Input 1

8
1 2 3 4 3 3 2 1
Sample Output 1

8
6
4
1
Explanation 1

sticks-length         length-of-cut   sticks-cut
1 2 3 4 3 3 2 1         1               8
_ 1 2 3 2 2 1 _         1               6
_ _ 1 2 1 1 _ _         1               4
_ _ _ 1 _ _ _ _         1               1
_ _ _ _ _ _ _ _       DONE            DONE */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRank_CutTheSticks {/*
                                       * Complete the 'cutTheSticks' function below.
                                       *
                                       * The function is expected to return an INTEGER_ARRAY.
                                       * The function accepts INTEGER_ARRAY arr as parameter.
                                       */
    public static void main(String[] args) throws IOException {
        Integer[] a = { 5, 4, 4, 2, 2, 8 };
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        System.out.println(cutTheSticksOptimal(list));

    }



    public static List<Integer> cutTheSticksOptimal(List<Integer> arr) {
        if (arr.size() <= 1) {
            return new ArrayList<Integer>() {{
                add(arr.size());  // Add the element to the list
            }};
        }
        List<Integer> result = new ArrayList<>();
        Collections.sort(arr);
        result.add(arr.size());
        int shortest = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            //System.out.println(arr);
            // reach next shortest
            //2, 2, 4, 4, 5, 8
            if(arr.get(i) - shortest > 0) {
                shortest = arr.get(i);
                result.add(arr.size() - i);
            }
        }
        return result;
    }
    //bruteforce
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        if (arr.size() <= 1) {
            return new ArrayList<Integer>() {{
                add(arr.size());  // Add the element to the list
            }};
        }
        List<Integer> result = new ArrayList<>();
        int size = arr.size();
        int cutCounter = 0;
        Collections.sort(arr);
        System.out.println(arr);
        while (size > 0) {
            int small = arr.get(0);
            int i = 0;
            while (i < size) {
                if (arr.get(i) == small) {
                    arr.remove(i);
                    size--;
                } else {
                    // System.out.println(i+" "+arr.get(i));
                    arr.set(i, arr.get(i) - small);
                    i++;
                }
                cutCounter++;
                // System.out.println(arr);
            }
            // System.out.println(arr);
            result.add(cutCounter);
            cutCounter = 0;
        }
        return result;
    }
}
/*
 * public static void main(String[] args) throws IOException {
 * BufferedReader bufferedReader = new BufferedReader(new
 * InputStreamReader(System.in));
 * BufferedWriter bufferedWriter = new BufferedWriter(new
 * FileWriter(System.getenv("OUTPUT_PATH")));
 * 
 * int n = Integer.parseInt(bufferedReader.readLine().trim());
 * 
 * List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
 * "").split(" "))
 * .map(Integer::parseInt)
 * .collect(Collectors.toList());
 * 
 * List<Integer> result = cutTheSticks(arr);
 * 
 * bufferedWriter.write(
 * result.stream()
 * .map(Object::toString)
 * .collect(Collectors.joining("\n"))
 * + "\n");
 * 
 * bufferedReader.close();
 * bufferedWriter.close();
 * }
 */
