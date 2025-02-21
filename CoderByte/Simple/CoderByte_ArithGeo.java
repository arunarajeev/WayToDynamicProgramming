package Simple;
/* 
 * Have the function ArithGeo(arr) take the array of numbers stored in arr and 
 * return the string "Arithmetic" if the sequence follows an arithmetic pattern
 *  or return "Geometric" if it follows a geometric pattern.
 * If the sequence doesn't follow either pattern return -1. 
 * An arithmetic sequence is one where the difference between
 * each of the numbers is consistent, where as in a geometric sequence, 
 * each term after the first is multiplied by some constant or common ratio. 
 * Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54].
 * Negative numbers may be entered as parameters, 0 will not be entered, 
 * and no array will contain all the same elements
 */

public class CoderByte_ArithGeo {
    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8 };
        int[] arr2 = { 2, 6, 18, 54 };
        int[] arr3 = { 2, 4, 8, 32 };
        int[] arr4 = {2,4};
        System.out.println(arithGeo(arr1));
        System.out.println(arithGeo(arr2));
        System.out.println(arithGeo(arr3));
        System.out.println(arithGeo(arr4));
    }

    private static String arithGeo(int[] arr) {
        boolean arith = true;
        boolean geo = true;
        int len = arr.length;
        if (len <= 2) {
            return "-1";
        }
        int geoMultiple = 0;
        int arithDiff = arr[1] - arr[0];
        if (arr[1] % arr[0] != 0) {
            geo = false;
        } else {
            geoMultiple = arr[1] / arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arith == true && arr[i] - arr[i - 1] != arithDiff) {
                arith = false;
            }
            if (geo == true && (arr[i] % arr[i - 1] != 0 || arr[i] / arr[i - 1] != geoMultiple)) {
                geo = false;
            }
            if (arith == false && geo == false) {
                return "-1";
            }
        }

        if (arith == true) {
            return "Arithmetic";
        } else if (geo == true) {
            return "Geometric";

        }
        return "-1";
    }
}
