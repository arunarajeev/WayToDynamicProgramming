
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


class StringReverse {

    public static void main(String[] args) {
        System.out.println(revStr("abcd"));
             System.out.println(revStr_usingCharArray("abcd"));
        System.out.println(revStr_usingStringBuilder("abcd"));
        System.out.println(revStr_usingCollections("abcd"));
    }

 private static String revStr_usingCollections(String s) {
      
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
       list.add(s.charAt(i));
        }
        Collections.reverse(list);
        Iterator it = list.iterator();
        String rev="";
        while (it.hasNext()) {
           rev =  rev+it.next();
            
        }
        
        return rev;
    }
    private static String revStr_usingCharArray(String s) {
        char[] arr = s.toCharArray();
        String rev = "";
        for (int i = 0; i < arr.length; i++) {
            rev = arr[i] + rev;
        }
        return rev;
    }

    private static String revStr_usingStringBuilder(String s) {

        StringBuilder rev = new StringBuilder();
        rev.append(s);
        return rev.reverse().toString();
    }

    private static String revStr(String s) {

        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        return rev;
    }


}
