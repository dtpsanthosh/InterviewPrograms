package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
 
public class StreamConcatEx {
 
    public static void main(String a[]) {
 
        List<Employee> accEmpList = new ArrayList<>();
        accEmpList.add(new Employee("Nataraja G", "Accounts", 8000));
        accEmpList.add(new Employee("Nagesh Y", "Accounts", 15000));
        List<Employee> adminEmpList = new ArrayList<>();
        adminEmpList.add(new Employee("Vasu V", "Admin", 2500));
        adminEmpList.add(new Employee("Amar", "Admin", 12500));
 
        Stream.concat(accEmpList.stream(), adminEmpList.stream()).forEach(System.out::println);
    }
}