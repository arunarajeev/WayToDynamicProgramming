package Simple;

/**
 * Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and return
 * the string true if it's a power of two. If it's not return the string false. For example if the input is 16 then
 * your program should return the string true but if the input is 22 then the output should be the string false.
 *
 * @author Nick Livens
 */

public class Coder_Byte_PowersOfTwo {
   public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfExpo(27,3));
    }

    private static boolean isPowerOfTwo(int num) {  
        return (Math.floor(Math.sqrt(num)) == Math.sqrt(num))?true:false;
    }

    private static boolean isPowerOfExpo(int num, int expo) {  
        return (Math.floor(Math.pow(num, 1/expo)) == Math.pow(num, 1/expo))?true:false;
    }
 
}
