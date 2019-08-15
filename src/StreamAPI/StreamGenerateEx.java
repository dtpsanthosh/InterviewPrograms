package StreamAPI;
import java.util.UUID;
import java.util.stream.Stream;
 
public class StreamGenerateEx {
 
    public static void main(String a[]) {
 
        Stream<UUID> uuidStream = Stream.generate(UUID::randomUUID);
        uuidStream.limit(10).forEach(System.out::println);
    }
}