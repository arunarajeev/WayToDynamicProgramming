
import java.util.Arrays;




class PrefixSumOfAnArray {

    public static void main(String[] args) {
        int arr[] = {3, 4, 12, 7, 8};
        int prefix[] = prefixsum(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+"  ");
        }
        

    }

    private static int[] prefixsum(int[] arr) {
        int len = arr.length;
        int[] preArr = new int[len];
        preArr[0] = arr[0];

        for (int i = 1; i < len; i++) {
            preArr[i] = arr[i] + preArr[i - 1];
        }

        return preArr;
    }

}
