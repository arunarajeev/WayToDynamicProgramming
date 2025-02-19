import java.math.BigDecimal;
import java.math.BigInteger;

class JavaTypeConversions {
    public static void main(String[] args) {

        int i = 19;
        // for any primitive to be converted to String, use String.valueOf()
        String s = String.valueOf(i);

        // for String to be converted to any primitive, use Integer.valueOf();
        int k = Integer.valueOf(s);
        long l = Long.valueOf(s);

        // primitive to Wrapper eg. int to Integer
        Integer ii = Integer.valueOf(i);
        Boolean bb = Boolean.valueOf(true);
        Double dd = Double.valueOf(23.456);
        Double d = 45.77;

        String strInt = "123";
        String strDouble = "45.67";
        String strBoolean = "true";

        // String to Wrapper
        Integer intObj = Integer.valueOf(strInt);
        Double doubleObj = Double.valueOf(strDouble);
        Boolean boolObj = Boolean.valueOf(strBoolean);

        // Wrapper to primitive eg. int to Integer
        i = ii;
        ii = i;
        Integer obj = 100; // Autoboxing: int to Integer
        int num = obj;

        // bignum
        BigInteger bigN = new BigInteger("7672648947614710847");
        int numm = bigN.intValue();
        System.out.println(numm);
        BigDecimal num1 = new BigDecimal("12345.6789123456789");
        float ff = num1.floatValue();
        numm = num1.intValue();
        System.out.println(numm);
        BigInteger bigNN = bigN.add(num1.toBigInteger());
        System.out.println(bigN);
        System.out.println(bigNN);

        /*
         * Integer.parseInt(String s)
         * Returns a primitive int value.
         * Does not involve caching or object creation.
         * Slightly faster than Integer.valueOf().
         */

        int num2 = Integer.parseInt("100"); // Returns primitive int
        System.out.println("Primitive int: " + num2);

        // Use Integer.valueOf() when:

        /*
         * You need an Integer object (e.g., storing in a Collection).
         * You want caching benefits for small values.
         */

        Integer num22 = Integer.valueOf("100"); // Wrapper object

        /*
         * Use Integer.parseInt() when:
         * 
         * You only need a primitive int for computations.
         * Performance is a concern.
         */

        int num33 = Integer.parseInt("100"); // Primitive int
        int decimal = Integer.parseInt("101", 2); // Binary to decimal
        Integer hex = Integer.valueOf("1A", 16); // Hexadecimal to Integer

        System.out.println("Binary '101' to decimal: " + decimal); // 5
        System.out.println("Hexadecimal '1A' to decimal: " + hex); // 26
        // hexa to integer
        int intnum = Integer.parseInt("AF4",16);
        System.out.println(intnum);

        // get hexadecimal value
        //Integer.toHexString(int);
        int numh = 255; 
        String hex1 = Integer.toHexString(numh);
        System.out.println("Hexadecimal: " + hex1);
        System.out.println(Integer.parseInt("10001001",2));
        System.out.println(Integer.toBinaryString(137));

        // get ascii value
        System.out.println(Integer.valueOf('A'));
        System.out.println(Integer.valueOf('a'));
        
        int binary9 = 0b1101_0101; // Binary with underscores - 0b/0B prefix
        int hex9 = 0xFF_AA;       // Hexadecimal with underscores - 0x/0X prefix
        int octal9 = 01_23;       // Octal with underscores - 0 prefix
        int decimal9 = 1_000_000; // Decimal with underscores

        System.out.println("Binary: " + binary9);
        System.out.println("Hexadecimal: " + hex9);
        System.out.println("Octal: " + octal9);
        System.out.println("Decimal: " + decimal9);
        // primitive array to Wrapper array

    }

}