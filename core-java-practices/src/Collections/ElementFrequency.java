package Collections;

import java.util.HashSet;

public class ElementFrequency {
    public  static int CountFrequency(int number, int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int a[]={1,2,1,3,4,5};
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!hashSet.contains(a[i])){
                hashSet.add(a[i]);
                System.out.println(CountFrequency(a[i],a));

            }
        }



    }
}
