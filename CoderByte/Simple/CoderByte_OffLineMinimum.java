package Simple;
/*
 * Have the function OffLineMinimum(strArr) take the strArr parameter being passed 
 * which will be an array of integers
 * ranging from 1...n and the letter "E" and return the correct subset based on the following rules.
 * The input will be in the following format: ["I","I","E","I",...,"E",...,"I"] 
 * where the I's stand for integers
 * and the E means take out the smallest integer currently in the whole set.
 * When finished, your program should return that new set with integers separated by commas.
 * For example: if strArr is ["5","4","6","E","1","7","E","E","3","2"] 
 * then your program should return 4,1,5.
 */
//using vararg to pass elements of an array as a parameter
public class CoderByte_OffLineMinimum {
    public static void main(String[] args) {
        // String[] arr = {"5","4","6","E","1","7","E","E","3","2"};
        System.out.println(offLineMinimum("5", "4", "6", "E", "1", "7", "E", "E", "3", "2"));
    }

    private static String offLineMinimum(String... arr) {
        String result = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            char currChar = arr[i].charAt(0);
            if (Character.isDigit(currChar)) {
                int num = Character.getNumericValue(currChar);
                if (num < min) {
                    min = num;
                } else {
                    result += String.valueOf(min) + " ";
                }
            }
        }
        result = result.trim().replace(" ", ",");
        return result;
    }
}
