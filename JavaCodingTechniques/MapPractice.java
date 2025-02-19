import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 33);
        map.put(7, 88);
        map.put(5, 44);
        map.put(3, 99);
        if (map.containsKey(3)) {
            System.out.println(map.get(3));
        }
        if (map.containsValue(44)) {
            System.out.println("Value present");
        }
        map.forEach((k, v) -> System.out.println(k + " : "
                + (v + 10)));
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (val == 88) {
                System.out.println("value is present");

            }

        }
        System.out.println(map);

List<Integer> ls = new ArrayList<Integer>();
ls.add(45);
ls.add(37);
ls.add(78);
System.out.println(ls);

Iterator it = ls.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}
        HashSet<Integer> set = new HashSet<>();
set.add(43);
set.add(34);
set.add(67);
set.add(78);
set.add(43);
System.out.println(set.size());
System.out.println(set);
for(Integer i:set){
    System.out.println(i*10);
}
    }
}
