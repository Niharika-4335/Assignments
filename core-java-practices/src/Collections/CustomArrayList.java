package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CustomArrayList {
    class Student {
        String phno;
        String name;
        Float marks;
        String address;

            public Student(String phno, String name, Float marks, String address) {
        this.phno = phno;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }
        public String toString() {
            return phno + " " + name + " " + marks + " " + address;
        }
    }

        public static void main(String xyz[]) {
//        CustomArrayList customArrayList=new CustomArrayList();
            String[] phno = {"9321", "12345", "3456", "123"};
            String[] name = {"niha", "soumya", "lavanya", "jyothi"};
            float[] marks = {98f, 95f, 95f, 92f};
            String[] address = {"guntur", "hyd", "bng", "ind"};
            CustomArrayList customArrayList=new CustomArrayList();
            customArrayList.Addfields(phno, name, marks, address);
        }

        private void Addfields(String[] phno, String[] name, float[] marks, String[] address) {
            List<Student> list = new ArrayList<Student>();
            for (int i = 0; i < 4; i++) {
                list.add(new Student(phno[i], name[i], marks[i], address[i]));
            }
            Comparator<Student> comparator = (emp2, emp3) -> {
                return emp2.marks.compareTo(emp3.marks);
            };
            Collections.sort(list, comparator);
            System.out.print(list);
        }

    }
