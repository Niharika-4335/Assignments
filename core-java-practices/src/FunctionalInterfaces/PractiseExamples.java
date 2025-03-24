package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PractiseExamples {
    public static void main(String[] args) {
//        Supplier<Double> supplier = () -> Math.PI;
//        Supplier<Double> supplier1 = () -> Math.random();
//        System.out.println(supplier.get());
//        System.out.println(supplier1.get());
//        //Supplier<Double> supplier2=()-> ; to return current timestamp as a string.
//        Function<String,Integer>function=(String a)->{return a.length();};
//        Function<Integer,Integer>function1=(Integer a)->{return a*a;};
//        Function<List<Integer>,Integer> function2=(List<Integer> list)-> {
//            Integer sum = 0;
//            for (int i = 0; i < list.size(); i++) {
//                sum = sum + list.get(i);
//            }
//            return sum;
//        };
//        System.out.println(function.apply("niharika"));
//        System.out.println(function1.apply(3));
//        List<Integer> list=new ArrayList();
//        list.add(4);
//        list.add(7);
//        list.add(3);
//        System.out.println(function2.apply(list));
//        Consumer<List<String>> consumer=(List<String> list1)->{
//            for(int i=0;i<list1.size();i++){
//                System.out.println(list1.get(i).toUpperCase());
//            }
//        };
//        Consumer<List<String>> consumer1=(List<String> list1)-> {
//            for(int i=0;i<list1.size();i++){
//                System.out.println(list1.get(i).length());
//            }
//        };
//        Consumer<List<String>> consumer2=(List<String> list1)-> {
//            for(int i=0;i<list1.size();i++) {
//                System.out.println(list1.get(i)+ "-processed");
//            }
//
//        };
//        List<String> list1=new ArrayList();
//        list1.add("venkatesh");
//        list1.add("anil");
//        list1.add("preethi");
//        consumer.accept(list1);
//        consumer1.accept(list1);
//        consumer2.accept(list1);
        List<Integer> list2=new ArrayList();
        list2.add(1);
        list2.add(6);
        list2.add(4);
        list2.add(9);
        list2.add(8);
        list2.add(12);
        list2.add(14);
        Predicate<Integer> predicate=(Integer i)->i%2==0;
        List<Integer> list3=new ArrayList<>();
        for(Integer a:list2){
            if(predicate.test(a)){
                list3.add(a);//if we try to update the list while traversing it shows exception.
            }
        }
        System.out.println(list3);
        Predicate<Integer> predicate1=(Integer i)->i>10;
        List<Integer> list4=new ArrayList<>();
        for(Integer a:list2){
            if(predicate1.test(a)){
                list4.add(a);//if we try to update the list while traversing it shows exception.
            }
        }
        System.out.println(list2);
        List<Integer> list5=new ArrayList<>();
        Predicate<Integer> predicate2=(Integer i)->i>5;
        for(Integer a:list2){
            if(predicate2.test(a)){
                list5.add(a);
            }

        }
        System.out.println(list5);
        }
    }

