package Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Order{
    Integer id;
    Integer amount;
    Integer status;

    public Order(Integer id, Integer amount, Integer status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }
}
public class StreamTask1 {
    public static void main(String[] args) {
        List<Order> list=new ArrayList<>();
        list.add(new Order(1,1000,1));
        list.add(new Order(4,3000,0));
        list.add(new Order(2,2000,0));
        list.add(new Order(3,4000,0));
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        countFrequency(hashMap,list);

    }
    public static void countFrequency(HashMap<Integer,Integer> hashMap,List<Order> list){
        for(Order order:list){
            hashMap.put(order.status, hashMap.getOrDefault(order.status,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }
    }

}
