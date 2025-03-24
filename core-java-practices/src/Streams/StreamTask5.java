package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
    String name;
    Integer price;
    Integer rating;

    public Product(String name, Integer price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String toString(){
        return name+" "+price+" "+rating;
    }
}
public class StreamTask5 {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        list.add(new Product("niharika",1000,3));
        list.add(new Product("abc",4000,3));
        list.add(new Product("abdul",3000,5));
        list.add(new Product("pavan",1000,2));
        list.add(new Product("venkatesh",2000,6));
        Comparator<Product> comparataor=(cmp1,cmp2)->{return cmp1.price.compareTo(cmp2.price);};
        Collections.sort(list,comparataor);
        System.out.println("sorting by price");
        for(Product a:list){
            System.out.println(a);
        }
        System.out.println("sorting by rating");
        Comparator<Product> comparataor1=(cmp1,cmp2)->{return cmp2.rating.compareTo(cmp1.rating);};
        Collections.sort(list,comparataor1);
        for(Product a:list){
            System.out.println(a);
        }


    }
}

