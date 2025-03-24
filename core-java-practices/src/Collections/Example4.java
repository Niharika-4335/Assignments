package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(4);
        arrayList1.add(4);
        arrayList1.add(5);
        arrayList1.add(6);

        ArrayList<Integer> arrayList3=new ArrayList<>();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList1);// i added only array list elements right.


      HashSet<Integer> hashSet=new HashSet<>(arrayList3);
//        for(Integer a:arrayList3){
//            hashSet.add(a);
//        }
        for(Integer a1:hashSet){
           System.out.print(a1);
        }


    }
}
