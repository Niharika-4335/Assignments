package FunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Biexample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a % b == 0;
        System.out.println(biPredicate.test(6, 3));
        BiPredicate<String, String> biPredicate1 = (a, b) -> a.length() > b.length();
        System.out.println(biPredicate1.test("niharika", "mounika"));
        BiConsumer<String, Integer> biConsumer = (a, b) -> {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        };
        biConsumer.accept("niharika", 3);
        BiConsumer<Integer, Integer> biConsumer1 = (a, b) ->System.out.println(a + b);
        BiConsumer<Integer, Integer> biConsumer2 = (a, b) ->System.out.println(a * b);
        BiConsumer<Integer, Integer> biConsumer3=biConsumer1.andThen(biConsumer2);
        biConsumer3.accept(3,5);
        BiFunction<Integer,Integer,Integer> biFunction1=(a,b)->{return a+b;};
        BiFunction<String,String,String> biFunction2=(a,b)->{return a+b;};
        BiFunction<Double,Double,Double> biFunction3=(a,b)->{return Math.pow(a,b);};
        System.out.print(biFunction1.apply(9,4));
        System.out.print(biFunction2.apply("niharika","lavanya"));
        System.out.print(biFunction3.apply(3.0,4.0));



    }


    }

