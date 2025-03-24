package Streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list=Arrays.asList(1,2,3,4,5,1,2,9);
        Stream<Integer> stream=list.stream();
//       List<Integer> list1= stream.distinct().collect(Collectors.toList());
//        System.out.println(list1);
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        stream.forEach(i->hashMap.put(i, hashMap.getOrDefault(i,0)+1));
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue()>1){
                System.out.print(entry.getKey()+" ");}
        }

    }
}
