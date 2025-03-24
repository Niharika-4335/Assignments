package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

class Student{
    int id;
    String name;
    int age;

    public Student(int id,String name,int age) {
        this.id=id;
        this.name=name;
        this.age=age;

    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || this.getClass()!=obj.getClass()) return false;
        Student student=(Student) obj;
        return id==student.id && name.equals(student.name) && age==student.age;
    }
    public int hashCode(){
       return Objects.hash(id,name,age);
    }

    public String toString(){
        return id+" "+name +" "+age +" ";
    }

}
public class StudentManagementExample {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(1, "niharika", 21));
        hashSet.add(new Student(2, "abc", 22));
        hashSet.add(new Student(3, "def", 23));
        hashSet.add(new Student(1, "niharika", 21));
        hashSet.add(new Student(4, "xyz", 20));
        hashSet.add(new Student(5, "upr", 22));
        hashSet.add(new Student(6, "lwr", 19));

        for (Student i : hashSet) {
            System.out.println(i);
        }
        HashMap<Integer, String> hashmap = new HashMap();
        hashmap.put(1, "A");
        hashmap.put(2, "A");
        hashmap.put(3, "B");
        hashmap.put(4, "C");
        hashmap.put(5, "D");
        System.out.println(getGrade(5, hashmap));
        System.out.println(getId("A", hashmap));
        getName("A",hashmap,hashSet);
        OlderPerson(hashSet);
    }

    public static String getGrade(int id, HashMap<Integer, String> hashMap) {
        return hashMap.get(id);
    }

    public static String getId(String grade, HashMap<Integer, String> hashMap) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (entry.getValue().equals(grade)) {
                stringBuilder.append(entry.getKey() + " has grade" + " " + entry.getValue() + " ");
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static void getName(String grade, HashMap<Integer, String> hashMap,HashSet<Student> hashSet) {
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (entry.getValue().equals(grade)) {
                for(Student student:hashSet){
                   if(student.id==entry.getKey()){
                       System.out.println(student.name);
                   }
                }
            }
        }
    }
    public static void OlderPerson(HashSet<Student> hashSet){
        int olderAge=0;
        for(Student student:hashSet){
            if(student.age>olderAge){
                olderAge=student.age;
            }
        }
        System.out.print(olderAge);
    }
}
