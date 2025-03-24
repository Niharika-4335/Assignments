package Streams.Objects.Examples;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> hobbies;

    public Student(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    public String toString(){
        return  name+" "+hobbies;
    }

}
