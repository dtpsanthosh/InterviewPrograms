package StreamAPI;
import java.util.stream.Stream;
 
public class StreamDistinctEx {
 
    public static void main(String a[]) {
 
        Stream.of("bus", "car", "bycle", "bus", "car", "car", "bike")
                .distinct()
                .forEach(System.out::println);
    }
}