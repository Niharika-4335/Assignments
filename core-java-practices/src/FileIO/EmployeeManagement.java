package FileIO;

import java.io.*;
import java.util.*;

class Employee{
    Integer id;
    String name;
    Integer age;
    String dept;
    Integer salary;

    public Employee(Integer id,  String name,Integer age, String dept, Integer salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString(){
        return id+","+name+","+age+","+dept+","+salary+"\n";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        try (FileWriter filewriter = new FileWriter("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt")) {
            filewriter.write(new Employee(1, "niharika", 23, "CSE", 10000).toString());
            filewriter.write(new Employee(3, "abc", 22, "ACSE", 2000).toString());
            filewriter.write(new Employee(2, "xyz", 26, "EEE", 3000).toString());
            filewriter.write(new Employee(4, "wxyz", 24, "ECE", 1000).toString());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
//        try (BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt"))) {
//            String line;
//            while ((line = bufferreader.readLine()) != null) {
//                String[] a = line.split(",");
//                int id = Integer.parseInt(a[0]);
//                String name = a[1];
//                int age = Integer.parseInt(a[2]);
//                String dept=a[3];
//                int salary=Integer.parseInt(a[4]);
//                list.add(id + "," + name + "," + age + "," + dept + ","+salary+"\n");
//            }
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Comparator<Employee> compid = (emp1, emp2) -> {
//            return emp1.age.compareTo(emp2.age);
//        };
//        Collections.sort(list);
//        for (String string : list) {
//            System.out.print(string);
//
//        }

        searchEmployee(1);
        updateEmployee(3);
        deleteEmployee(2);
    }

    public static void searchEmployee(int id1) {
        try (BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt"))) {
            String line;
            while ((line = bufferreader.readLine()) != null) {
                String[] a = line.split(",");
                int id = Integer.parseInt(a[0]);
                String name = a[1];
                int age = Integer.parseInt(a[2]);
                String dept = a[3];
                int salary = Integer.parseInt(a[4]);
                if (id == id1) {
                    System.out.print(name + " " + age + " " + dept + " " + salary + "\n");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateEmployee(int id2) {
        List<String> list1 = new ArrayList<>();
         try(BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt"))) {
            String line;
            while ((line = bufferreader.readLine()) != null) {
                String[] a = line.split(",");
                int id = Integer.parseInt(a[0]);
                String name = a[1];
                int age = Integer.parseInt(a[2]);
                String dept = a[3];
                int salary = Integer.parseInt(a[4]);
                if (id == id2) {
                    salary = 30000;
                    dept = "mechanical";
                }
                list1.add(id + "," + name + "," + age + "," + dept + "," + salary + "\n");
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt"))) {
                for (String string : list1) {
                    bufferedWriter.write(string);
                    bufferedWriter.write("");
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteEmployee(int id3) {
        List<String> list2=new ArrayList<>();
        try (BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt"))) {
            String line;
            while ((line = bufferreader.readLine()) != null) {
                String[] a = line.split(",");
                int id = Integer.parseInt(a[0]);
                String name = a[1];
                int age = Integer.parseInt(a[2]);
                String dept = a[3];
                int salary = Integer.parseInt(a[4]);
                list2.add(id + "," + name + "," + age + "," + dept + "," + salary+"\n");

            }
            System.out.println(list2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt"))) {
            String line;
            while ((line = bufferreader.readLine()) != null) {
                String[] a = line.split(",");
                int id = Integer.parseInt(a[0]);
                String name = a[1];
                int age = Integer.parseInt(a[2]);
                String dept = a[3];
                int salary = Integer.parseInt(a[4]);
                if(id==id3){
                    list2.remove(id);
                }
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt"))) {
                    for (String string : list2) {
                        bufferedWriter.write(string);
                        bufferedWriter.write("");
                    }

                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}

