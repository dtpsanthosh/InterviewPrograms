package Practice;
import java.util.stream.Stream;

public class Distinct{  
   public static void main(String[] args) {  
   	Stream.of("Jai", "Mahesh", "Vishal", "Jai", "Hemant", "Naren", "Vishal")
       .distinct()
       .forEach(System.out::println);
   }  
}