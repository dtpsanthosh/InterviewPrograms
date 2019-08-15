package StreamAPI;
import java.util.ArrayList;
import java.util.List;
 
public class StreamFindEx {
 
    public static void main(String a[]) {
 
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Admin", 12500));
 
        empList.stream().filter(emp->emp.getAccount().matches("Admin"))
                        .findFirst()
                        .ifPresent(System.out::println);
 
        empList.stream().filter(emp->emp.getAccount().matches("Admin"))
                        .findAny()
                        .ifPresent(System.out::println);
    }
}