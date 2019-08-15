package StreamAPI;
import java.util.UUID;
import java.util.stream.Stream;
 
public class StreamLimitEx {
 
    public static void main(String a[]) {
 
        Stream.of("bus", "car", "bicycle", "flight", "train").limit(3).forEach(System.out::println);
        System.out.println("--------------------------------");
        Stream.generate(UUID::randomUUID).limit(10).forEach(System.out::println);
    }
}