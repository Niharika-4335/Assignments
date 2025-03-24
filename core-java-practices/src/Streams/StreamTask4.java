package Streams;

import java.util.*;

public class StreamTask4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(6);
        list.add(4);
        list.add(1);
        TreeMap<Integer,Integer> hashMap=new TreeMap<>();
        getFrequency(hashMap,list);
    }
    public static void getFrequency(TreeMap<Integer,Integer> hashMap,List<Integer> list) {
        for (Integer b : list) {
            hashMap.put(b, hashMap.getOrDefault(b, 0) + 1);
        }
//        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
        int Maximum_key = 0;
        int Maximum_value = -1;
//        StringBuilder stringBuilder=new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > Maximum_value) {
                Maximum_value = entry.getValue();
                Maximum_key = entry.getKey();
//                stringBuilder.append(Maximum_key);
            }

        }
        System.out.print(Maximum_key);
    }

    }

