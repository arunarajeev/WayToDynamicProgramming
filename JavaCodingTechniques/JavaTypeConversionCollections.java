import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class JavaTypeConversionCollections{

    public static void main(String[] args) {
        //A. Convert int[] to Integer[] primitive to wrapper
        int[] intArr = {4,2,8,6};
        Integer[] nArr = Arrays.stream(intArr).boxed().toArray(Integer[] :: new); 

        //int[] to String to print the array elements.
        System.out.println(intArr.toString());
        System.out.println(Arrays.asList(intArr));
        System.out.println(Arrays.asList(nArr));
        System.out.println(Arrays.toString(nArr));
        System.out.println(Arrays.toString(intArr));
        //Integer[] sortA = Arrays.sort(nArr);
        //int[] sortA = Arrays.sort(intArr);
        System.out.println();
     
        //B. Convert int[] to List[] primitive to List
        //List<Integer> list10 = Arrays.asList(intArr); --This is incorreci

        List<Integer> list11 = Arrays.stream(intArr).boxed().toList();

        //C. Convert Integer[] to List[] wrapper to List
        List<Integer> list10 = Arrays.asList(nArr);


        //D. Convert String[] to List[] string to List
        String[] arrStr = {"Green","yellow","red"};
        List<String> listss = Arrays.asList(arrStr);

        //1. Convert List to Set (Remove Duplicates)
      
        List<Integer> list = Arrays.asList(2,8,8,3,6,3);
        Set<Integer> set = new HashSet<>(list); // Converts List to Set (removes duplicates)
       
        System.out.println(set); // Output: [1, 2, 3, 4, 5]
       
        // Use case: Removes duplicates while converting.
        list = Arrays.asList(2,8,8,3,6,3);
        SortedSet<Integer> numbers = new TreeSet<>(Arrays.asList(5, 2, 8, 1));
        System.out.println(numbers);
        SortedSet<Integer> sortedSetList = new TreeSet<>(list);
        System.out.println(sortedSetList);
        SortedSet<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);
        //2. Convert Set to List (Preserve Order)
        
        Set<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        List<String> list1 = new ArrayList<>(set1); // Converts Set to List
       
        System.out.println(list1);
        //Use case: Needed when working with APIs that require a List.

        
        //3. Convert Array to List
        
        String[] array = { "A", "B", "C" };
        List<String> list2 = Arrays.asList(array); // Fixed-size List backed by array
        //]list2.add("435");
        System.out.println(list2);
        //Caution: Arrays.asList(array) returns a fixed-size list. 
        //****Use new ArrayList<>(Arrays.asList(array)) for a resizable list.
        List<String> listResizable = new ArrayList<>(Arrays.asList(array)); // Fixed-size List backed by array
        listResizable.add("A435");
        System.out.println("listResizable"+listResizable);

        //4. Convert List to Array
        
        List<String> list3 = Arrays.asList("Java", "Python", "C++");
        
        String[] array3 = list3.toArray(new String[0]); // Converts List to Array
        System.out.println("List to Array:   "+Arrays.toString(array3));
        List<Integer> intlist3 = Arrays.asList(4,7,1,8,3);
        Integer[] intarray3 = intlist3.toArray(new Integer[0]); // Converts List to Array
        System.out.println("List to Array:   "+Arrays.toString(array3));
        //Use case: Required when interfacing with legacy APIs that use arrays.


        //5. Convert Map to List (Keys or Values)
        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        List<Integer> keys = new ArrayList<>(map.keySet()); // Extracts keys
        List<String> values = new ArrayList<>(map.values()); // Extracts values

        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        //Use case: Extracts only keys or values.

        
        //6. Convert List to Map (Using Streams)

        List<String> list6 = Arrays.asList("A", "B", "C");

        Map<Integer, String> map6 = list6.stream()
                .collect(Collectors.toMap(String::length, str -> str, (e1, e2) -> e1));

        System.out.println(map6);
        //Use case: Convert a list into a map where the key is the string length.

        
        //7. Convert Stream to List or Set

        Stream<String> stream = Stream.of("Java", "Python", "C++");
        List<String> list7 = stream.collect(Collectors.toList());
        System.out.println(list7); 
        //Use case: Collects stream results into a list.

    }
}

/* 
Final Summary Table
Conversion	Method
List → Set	new HashSet<>(list)
Set → List	new ArrayList<>(set)
Array → List	Arrays.asList(array)
List → Array	list.toArray(new String[0])
Map → List	new ArrayList<>(map.keySet()) / .values()
List → Map	list.stream().collect(Collectors.toMap(...))
Stream → List	stream.collect(Collectors.toList())
*/
    
