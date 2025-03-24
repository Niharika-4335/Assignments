package Collections;
import java.util.HashMap;
import java.util.Map;

public class HashExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(4, 0.75f);

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
       System.out.print(map.get(1));
       for(Map.Entry<Integer,String> entry:map.entrySet()){
         System.out.print(entry.getKey() + "  " +entry.getValue());
       }

        System.out.println(map);
    }
}
