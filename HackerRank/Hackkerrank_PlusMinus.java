
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Hackkerrank_PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        float pos = 0;
        float neg = 0;
        float zero = 0;
        for (int i : arr) {
            if (i > 0)
                pos++;
            else if (i < 0)
                neg++;
            else
                zero++;
        }
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(pos / arr.size()));
        System.out.println(df.format(neg / arr.size()));
        System.out.println(df.format(zero / arr.size()));
    }

    public static void main(String[] args) throws IOException {
       /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());*/
       
      
        Integer[] a= {2,-1,0,-3,-1,6};
        List<Integer> arr = new ArrayList<>(Arrays.asList(a));
        plusMinus(arr); 
        //bufferedReader.close();
    }
}
