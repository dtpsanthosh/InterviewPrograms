package StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
 
public class StreamConcurrentChangEx {
 
    public static void main(String a[]) {
 
        List<String> vehicles = new ArrayList<>(Arrays.asList("bus", "car", "bicycle", "flight", "train"));
 
        Stream<String> vStream = vehicles.parallelStream();
        vehicles.add("bike");
        vStream.filter(str->str.length() > 3).map(String::toUpperCase).sorted().forEach(System.out::println);;
    }
}