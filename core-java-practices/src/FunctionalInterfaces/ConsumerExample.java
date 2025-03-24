package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        Consumer<List<Integer>> consumer=(l)->{
            l.forEach(i->System.out.println(2*i));

            for(int i=0;i<l.size();i++)
                System.out.println(l.get(i));//it takes input and provides an output.
        };
        //Consumer
        consumer.accept(list);
        //Supplier
        Supplier<Double> value=()->Math.PI;//it doesnt take any argument but returns a value
        System.out.println(value.get());
//        Function
        Function<Integer,Integer> function=(a)->a%10;//one param-input another param-output type
        //compose executes first before the first task.
        function=function.compose(a->a*3);
        System.out.println(function.apply(5));
        //checking two or more conditions
        Predicate<Integer> num=(Integer d)->d>10;//it returns boolean value
        Predicate<Integer> num1=(Integer d)->d<20;
        System.out.println(num.and(num1).test(14));
        System.out.println(num.and(num1).negate().test(15));


    }
}
