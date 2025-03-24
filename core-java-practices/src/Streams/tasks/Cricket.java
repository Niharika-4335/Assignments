package Streams.tasks;

import java.util.List;

public class Cricket {
    String name;
    List<Integer>  list;
    Integer rank;

    public Cricket(String name, List<Integer> list, Integer rank) {
        this.name = name;
        this.list = list;
        this.rank = rank;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public String toString(){
        return name+" "+list+" "+rank;
    }

}
