package Simple;

import java.util.Arrays;

class Coderbyte_longestWord{
    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "William Shakespeare was an English poet, playwright, actor, and theater entrepreneur. He is often called the \"Bard of Avon\" and England's national poet. ";
        System.out.println(longest(str));
        
    }
    
        private static String longest(String str) {
            String longWord ="";
            if(str.isEmpty()||str.isBlank())
                return "";
            String[] strArr = str.split("\\W+|\\_|[0-9]+");
            System.out.println(Arrays.toString(strArr));
            
            for(String s:strArr){
                if(s.length()>longWord.length()){
                    longWord = s;
                }
            }
            return longWord;
        }
}

