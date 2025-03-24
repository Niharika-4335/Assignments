package FunctionalInterfaces;

import java.util.*;
//interface A{
//    public void EvenNumbers(int x);
//
//}
//public class LambdaExpressionExample {
//    public static void main(String[] args) {
//        A a=(int x)->System.out.print(x*2);//here java internally creates an anonymous class instance that implements functional inteface.
//        a.EvenNumbers(4);
//    }
//}
//interface A{
//    public void EvenNumbers(int x);
//}
//public class LambdaExpressionExample {
//    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(6);
//        list.forEach(i->System.out.print(i));
//        list.forEach(j->{if(j%2==0)
//            System.out.print(j);
//        });
//    }
//}
//interface Calculator{
//    public void operation(int a,int b);
//
//}
//public class LambdaExpressionExample {
//    public static void main(String[] args) {
//        Calculator add=(int a,int b)->System.out.print(a+b);
//        Calculator sub=(int a,int b)->System.out.print(a-b);
//        Calculator mul=(int a,int b)->System.out.print(a*b);
//        Calculator div=(int a,int b)->System.out.print(a/b);
//        add.operation(5,3);
//        sub.operation(5,3);
//        mul.operation(5,3);
//        div.operation(5,3);
//
//    }
//}
class Example{
    Integer id;
    String name;
    Integer salary;

    public Example(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return id+" "+name+" "+salary+"\n";
    }

}
public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<Example> list=new ArrayList<>();
        list.add(new Example(1,"niharika",2000));
        list.add(new Example(7,"anil",23000));
        list.add(new Example(2,"lavanya",25000));
        list.add(new Example(3,"venkatesh",80000));
//        Comparator<Example> cmpsal=(sal1,sal2)->{return sal1.salary.compareTo(sal2.salary);};
        Collections.sort(list,(sal1,sal2)->{return sal2.id.compareTo(sal1.id);});

//        list.sort((sal1,sal2)->{return sal1.id.compareTo(sal2.id);});
        for(Example e:list){
            System.out.print(e);
        }
    }
    }

