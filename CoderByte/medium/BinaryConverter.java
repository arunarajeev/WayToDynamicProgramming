package medium;

public class BinaryConverter {
    public static void main(String[] args) {
        int binNum = 0b1000_0011_1101;
        int octNum = 07677_3445;
        int hexNum = 0xFFAA;
        int num = 789;

        System.out.println("toBinary:   " + num + "-->" + toBinary(num));
        System.out.println("toBinaryString:   " + num + "-->" + toBinaryString(num));

        System.out.println("toOctal:   " + num + "-->" + toOctal(num));
        System.out.println("toOctalString:   " + num + "-->" + toOctalString(num));

        System.out.println("toHex:   " + num + "-->" + toHex(num));
        System.out.println("toHexString:   " + num + "-->" + toHexString(num));
        
        System.out.println("stringBinaryToInt:   " + "10001101" + "-->" + stringBinaryToInt("10001101"));
        System.out.println("stringOctalToInt:   " + "2344" + "-->" + stringOctalToInt("2344"));
        System.out.println("stringHexToInt:   " + "FFAA" + "-->" + stringHexToInt("FFAA"));
    }

    private static int stringBinaryToInt(String binNum) {
        return Integer.parseInt(binNum, 2);
    }

    private static int stringOctalToInt(String octNum) {
        return Integer.parseInt(octNum, 8);
    }

    private static int stringHexToInt(String hexNum) {
        return Integer.parseInt(hexNum, 16);
    }

    private static int toBinary(int num) {
        return Integer.parseInt(Integer.toBinaryString(num));
    }

    private static String toBinaryString(int num) {
        return Integer.toBinaryString(num);
    }

    private static int toOctal(int num) {
        return Integer.parseInt(Integer.toOctalString(num));
    }

    private static String toOctalString(int num) {
        return Integer.toOctalString(num);
    }

    private static int toHex(int num) {
        return Integer.parseInt(Integer.toHexString(num));
    }

    private static String toHexString(int num) {
        return Integer.toHexString(num);
    }

}
