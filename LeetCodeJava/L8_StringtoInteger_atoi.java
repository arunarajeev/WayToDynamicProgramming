public class L8_StringtoInteger_atoi {
    public static void main(String[] args) {
        String s = "42";
        System.out.println(aToi(s));
    }

    private static int aToi(String s) {
        int n = 0;
        s=s.trim();
        char c = s.charAt(0);
        if(c=='-' || c=='+'){
            if(c=='-'){
                n=-1;
            }
            else{
                n=1;
            }
            s=s.substring(1);
        }
       
        s=s.replace("^0+", "");
try {
   int f = Integer.parseInt(s.substring(0,1)); 
} catch (Exception e) {
    
    return 0;
}

s=s.strip();
        return 0;
    }
}
