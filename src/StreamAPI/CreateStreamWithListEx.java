package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
 
public class CreateStreamWithListEx {
 
    public static void main(String[] args) {
 
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        Stream<String> vStream = vehicles.stream();
        vStream.forEach(System.out::println);
    }
}