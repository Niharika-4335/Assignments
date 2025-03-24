package Collections;
import java.util.*;
public class HashMapExample2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int[] a = {1, 1, 1, 2, 2, 3};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : a) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);

        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
        int Maximum_key = 0;
        int Maximum_value = -1;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > Maximum_value) {
                Maximum_value = entry.getValue();
                Maximum_key = entry.getKey();
            }
        }
        System.out.println(Maximum_key);//to find the k most frequent elements in a list i have found first maximum.now try to find that.
    }

}

