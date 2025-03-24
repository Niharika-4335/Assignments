package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;
public class HighestFrequency {
    public static void main(String[] args) {
        int[] a={};
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        for(int i:a){
            treeMap.put(i, treeMap.getOrDefault(i,0)+1);
        }
//        for(Map.Entry<Integer,Integer> entry: treeMap.entrySet()){
//            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
//        }
        int i=0;
        if(treeMap.isEmpty()) {
            return;
        }
        else {
            int b=sc.nextInt();
            System.out.print("finding the maximum k elements ");
            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
                i++;
                if (i == b) {
                    break;
                }
            }
        }


    }

}
