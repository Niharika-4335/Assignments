package FunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator=(Integer a)->{return a++;};
        System.out.println(unaryOperator.apply(5));
        UnaryOperator<String> unaryOperator1=(String a)->{
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=a.length()-1;i>=0;i--){
                stringBuilder.append(a.charAt(i));
            }
            return stringBuilder.toString();
            };
        System.out.println(unaryOperator1.apply("niharika"));
        BinaryOperator<Integer> binaryOperator=(a,b)->a>b?a:b;
        binaryOperator.apply(5,3);
        


    }
}
