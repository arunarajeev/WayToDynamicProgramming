public class CoderByte_DashInsert {

    public static void main(String[] args) {
        String str = "A35B34C5ff7ds9853dfg";
        System.out.println(insertDash(str));
    }

    private static String insertDash(String str) {
        char[] chars = str.toCharArray();
        int prev = -1;
        if (Character.isDigit(chars[0])) {
            if (isOdd(chars[0]))
                prev = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        //C35DD679FGT8
        for (int i = 1; i < str.length(); i++) {
            
            if (!Character.isDigit(chars[i]))  {
                prev = -1;
            }
            else{
                if(isOdd(chars[i]) == false) {
                    prev = -1;
                }
                else {
                    if( prev != -1 && prev==i-1){
                        sb.append("-");
                    }
                    prev = i;
                }
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    private static boolean isOdd(char c) {
        int num = Integer.parseInt(String.valueOf(c));
        int[] oddDigits = { 1, 3, 5, 7, 9 };
        for (int i = 0; i < oddDigits.length; i++) {
            if (num == oddDigits[i])
                return true;
        }
        return false;
    }
}
