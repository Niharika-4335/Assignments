package FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class StudentFields{
    int id;
    String name;
    int age;
    String grade;

    public StudentFields(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String toString(){
        return id + "," +name+ ","+age + ","+grade+"\n";
    }
}
public class StudentRecords {
    public static void main(String[] args) throws IOException {
        try (FileWriter filewriter = new FileWriter("C:\\Users\\FL_LPT-361\\Documents\\input.txt")) {
            filewriter.write(new StudentFields(1, "niharika", 23, "A").toString());
            filewriter.write(new StudentFields(3, "abc", 22, "C").toString());
            filewriter.write(new StudentFields(2, "xyz", 20, "A").toString());

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        try (BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\input.txt"))) {
            String line;
            while ((line = bufferreader.readLine()) != null) {
                String[] a = line.split(",");
                int id = Integer.parseInt(a[0]);
                String name = a[1];
                int age = Integer.parseInt(a[2]);
                String grade = a[3];
                System.out.println(id + "," + name + "," + age + "," + grade + "\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        UpdateRecords("niharika");
        DeleteRecords(3);
    }

    public static void UpdateRecords(String name1) throws IOException {
        List<String> list=new ArrayList<>();
        try (BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\input.txt"))) {
            String line;
            while ((line = bufferreader.readLine()) != null) {
                String a[] = line.split(",");
                int id = Integer.parseInt(a[0]);
                String name = a[1];
                int age = Integer.parseInt(a[2]);
                String grade = a[3];
                if (name.equals(name1)){
                    grade="C";
                    age=25;
                }
                list.add(id + "," +name+","+age+","+grade+" ");
            }


        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\FL_LPT-361\\Documents\\input.txt"))) {
            for(String string:list){
                System.out.println(string);
                bufferedWriter.write(string);
                bufferedWriter.write("\n");
            }
        }
    }
    public static void DeleteRecords(int id1){
        List<String> list=new ArrayList<>();
        try (BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\input.txt"))) {
            String line;
            while ((line = bufferreader.readLine()) != null) {
                String a[] = line.split(",");
                int id = Integer.parseInt(a[0]);
                String name = a[1];
                int age = Integer.parseInt(a[2]);
                String grade = a[3];
                list.add(id + "," + name + "," + age + "," + grade + " ");
                if (id == id1) {
                    list.remove(id + "," + name + "," + age + "," + grade + " ");
                }
    }

} catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\FL_LPT-361\\Documents\\input.txt"))) {
            for(String string:list){
                System.out.println(string);
                bufferedWriter.write(string);
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}