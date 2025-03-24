package Collections;
import java.util.*;
public class HashMapExample1 {
    public static void main(String[] args) {
        String a="hi this is an example of usage of maps and sets in collections example number one";
        String [] a1=a.split(" ");
        HashSet<String> hashSet=new HashSet<>();
        for(int i=0;i<a1.length;i++){
            hashSet.add(a1[i]);

        }
//        for(String a2:hashSet){
//            System.out.println(a2);
//        }
        HashMap<String,Integer> hashMap=new HashMap<>();
        for(String a2:a1){
            hashMap.put(a2,hashMap.getOrDefault(a2, 0) + 1);
       }
        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() +":" +entry.getValue());
        }
        }
    }

