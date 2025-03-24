package Collections;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
       List<String> list= new ArrayList<>();
       list.add("niharika");
        list.add("saraswathi");
        list.add("anil");

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String a:list) {
            hashMap.put(a,a.length());

        }

        String Maximum_key ="None";
        int Maximum_value = -1;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > Maximum_value) {
                Maximum_value = entry.getValue();
                Maximum_key = entry.getKey();
            }
        }
        System.out.println(Maximum_key);
    }
}
