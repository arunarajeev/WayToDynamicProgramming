
import java.util.Arrays;

public class Regex_removeallpunctuations {
    public static void main(String[] args) {
        String str = "yfgr6 56454c vg!!m ? :?< b><? @^ HDE$% 765";
        System.out.println(Arrays.toString(str.replaceAll("[^a-zA-Z ]", "").split("\\s+")));
    }
}
