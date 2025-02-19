import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerRank_AppendString {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. STRING t
     * 3. INTEGER k
     *  hackerhappy
        hackerrank
        9
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        String[] ss = s.split("");
        String[] tt = t.split("");
        int i =0;
        while((ss[i].equals(tt[i]))&&(ss.length>i)&&(tt.length>i)){
            i++;
        }
        if((ss.length-i>k)||(tt.length-i>k)||(ss.length-i)+(tt.length-i)>k)
        return "No";

        return "yes";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
