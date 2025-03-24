package Collections;

import java.util.ArrayList;

public class UniqueList extends ArrayList<Integer>{


    @Override
    public boolean add(Integer integer) {
        if(contains(integer)){
            return false;
        }
        return super.add(integer);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }
    public static void main(String[] args) {
        UniqueList uniqueList = new UniqueList();
        uniqueList.add(5);
        uniqueList.add(4);
        uniqueList.add(3);
        uniqueList.add(3);


    }
}
