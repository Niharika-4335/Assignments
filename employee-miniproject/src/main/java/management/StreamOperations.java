package management;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void highSalaryEmployees(List<Employee> list) {
        try {
            List<Employee> highSalaryEmployees = list.stream().filter(i -> i.getSal() > 2000).collect(Collectors.toList());
            System.out.println(highSalaryEmployees);
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }

    public static void CountEmployeesByDept(List<Employee> list) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting())));

    }

    public static void highestSalary(List<Employee> list) {
        Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSal));
        if (max.isPresent()) System.out.println(max);
    }


    public static void sortByName(List<Employee> list) {
        List<String> listofnames = list.stream().map(i -> i.getName()).distinct().sorted().collect(Collectors.toList());
        System.out.println(listofnames);
    }

//public static void earlyEmployees(List<Employee> list){
//    list.stream().ma
//}

    public static void joinDepartments(List<Employee> list) {
        System.out.println(list.stream().map(i -> i.getDept()).collect(Collectors.joining(",")));
    }

    public static void averageSalary(List<Employee> list) {
        System.out.println(list.stream().mapToInt(i -> i.getSal()).average());
    }

    public static void filterByGender(List<Employee> list) {
        Map<Boolean, List<Employee>> partition = list.stream().collect(Collectors.partitioningBy(i -> Boolean.parseBoolean(i.getGender())));
        System.out.println(partition);
//    List<Employee> maleEmployees=partition.get("male");
//    List<Employee> femaleEmployees=partition.get("female");
//    System.out.println(maleEmployees);
//    System.out.println(femaleEmployees);

    }
}
