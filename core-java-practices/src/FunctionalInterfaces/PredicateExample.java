package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static void pred(int number, Predicate <Integer> predicate){
        if(predicate.test(number)){
            System.out.print(number);
        }
    }

    public static void main(String[] args) {
        pred(3,i->i>1);
    }
}
