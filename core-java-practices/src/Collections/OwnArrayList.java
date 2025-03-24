package Collections;

import java.util.Arrays;

public class OwnArrayList {
    int size=0;
    int default_size=10;
    int[] arr;
    public OwnArrayList() {
        //this.arr = arr;if we create like this we have to pass an array as a
        //argument but in arraylist we have to allocate memory in runtime.
        this.arr = new int[default_size];
    }
        public void add(int num){
            if(isFull()){
                resize();
            }
                arr[size++]=num;
        }
        public boolean isFull(){
          return size==arr.length;
        }
        public void resize(){
        int[] temp=new int[2*arr.length];
        for(int i=0;i<size;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        }
        public void remove(int index) {
            for (int i = index; i <size; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }

        public int GetValue(int index){
        return arr[index];
        }
        public void SetValue(int index,int value){
        arr[index]=value;
        }
        public int Size(){
           return size;
        }
        public String toString() {
        return Arrays.toString(arr);
        }
    public static void main(String[] args) {
        OwnArrayList ownArrayList=new OwnArrayList();
        ownArrayList.add(1);
        ownArrayList.add(2);
        ownArrayList.add(3);
        for(int i=4;i<7;i++) {
            ownArrayList.add(i);
        }
        ownArrayList.remove(3);
     System.out.println(ownArrayList.GetValue(6));

        System.out.print(ownArrayList);

        }



    }
