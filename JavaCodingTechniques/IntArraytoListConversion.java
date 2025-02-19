
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class IntArraytoListConversion {

    public static void main(String[] args) {
    
         //Convert int[] to List
         int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
         List<Integer> lll = Arrays.stream(nums).boxed().toList();
         List<Integer> intList = new ArrayList<>(IntStream.of(nums).boxed().toList());
         
        System.out.println(intList);
         /*
         Arrays.stream(nums): Converts int[] into an IntStream.
        .boxed(): Converts each primitive int into an Integer.
        .toArray(Integer[]::new): Collects the boxed values into an Integer[].
        */    
        List list2 = Arrays.stream(nums).boxed().toList(); 
        Integer[] integerArr = Arrays.stream(nums).boxed().toArray(Integer[] :: new);                              
        List<Integer> list = Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]:: new));
        List<Integer> list1 = Arrays.stream(nums).boxed().toList();
        // Converting using array to list using Arrays.asList()
        String[] arr = {"geeks", "for", "geeks", "for", "dev"};
        List<String> strList = Arrays.asList(arr);
        System.out.println(strList);

        // Convert Integer[] to List
        Integer[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        List<Integer> integerlist = Arrays.asList(nums1);
        System.out.println(integerlist);
    }
}