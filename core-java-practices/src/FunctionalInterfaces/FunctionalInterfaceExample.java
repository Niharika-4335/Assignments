package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class E{
    Integer id;
    String name;
    Integer salary;

    public E(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
      return id+" "+name+" "+salary+"\n";
  }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        List<E> list=new ArrayList<>();
        list.add(new E(1,"Niharika",200));
        list.add(new E(3,"Lavanya",100));
        list.add(new E(4,"venkatesh",200));
        list.add(new E(2,"anil",300));
        Predicate<E> highsal=(emp)->emp.salary>100;
        for(E i:list){
            if(highsal.test(i)){
                System.out.println(i);
            }

        }
        Function<E,E> function=(emp)->{
            emp.salary += 100;
                return emp;
        };
       for(E i:list){
          function.apply(i);
       }
       Consumer<E> consumer=(emp)-> {
               System.out.println(emp);
       };
       for(E i:list){
           consumer.accept(i);
       }


    }
}
