package medium;

/**
 * Have the function ArithGeoII(arr) take the array of numbers stored in arr
 * and return the string "Arithmetic" if the sequence follows an arithmetic
 * pattern
 * or return "Geometric" if it follows a geometric pattern.
 * If the sequence doesn't follow either pattern return -1.
 * An arithmetic sequence is one where the difference between
 * each of the numbers is consistent, where as in a geometric sequence,
 * each term after the first is multiplied by
 * some constant or common ratio. Arithmetic example: [2, 4, 6, 8] and
 * Geometric example: [2, 6, 18, 54].
 * Negative numbers may be entered as parameters, 0 will not be entered,
 * and no array will contain all the same elements
 */

public class ArithGeoTwo {

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8 };
        int[] arr2 = { 2, 6, 18, 54 };
        int[] arr3 = { 2, 6, 18, 18, 54 };
        System.out.println(isArithGeo(arr1));
        System.out.println(isArithGeo(arr2));
        System.out.println(isArithGeo(arr3));
    }

    private static String isArithGeo(int[] arr) {
        boolean isGeo = true;
        boolean isArith = true;
        if (arr.length < 3)
            return "-1";
        int arithDiff = arr[1] - arr[0];
        int geoMult = Integer.MAX_VALUE;
        if (arr[1] % arr[0] != 0) {
            isGeo = false;
        } else {
            geoMult = arr[1] / arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (isGeo == false && isArith == false) {
                return "-1";
            }
            if (isArith == true)
                isArith = (arr[i] - arr[i - 1]) == arithDiff ? true : false;
            if (isGeo == true && (arr[i] % arr[i - 1] == 0)) {
                isGeo = (arr[i] / arr[i - 1]) == geoMult ? true : false;
            }
        }
        if (isArith == true)
            return "Arithmetic";
        if (isGeo == true)
            return "Geometric";
        return "-1";
    }
}
