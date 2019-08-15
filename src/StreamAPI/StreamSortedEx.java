package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
 
public class StreamSortedEx {
 
    public static void main(String a[]) {
 
        Stream.of("bus", "car", "bicycle", "flight", "train")
                .sorted()
                .forEach(System.out::println);
 
        System.out.println("-------------------------");
 
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Entertainment", 12500));
 
        empList.stream()
                .sorted((emp1, emp2)->emp1.getSalary().compareTo(emp2.getSalary()))
                .forEach(System.out::println);
    }
}