package StreamAPI;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
 
public class PrimitiveStreamEx {
 
    public static void main(String a[]) {
 
        IntStream inStrm = IntStream.of(10, 20, 30, 40);
        System.out.println("----- IntStream -----");
        inStrm.forEach(System.out::println);
 
        double[] results = {98.12, 72.17, 75.20, 68.6};
        DoubleStream resultStream = Arrays.stream(results);
        System.out.println("----- DoubleStream -----");
        resultStream.forEach(System.out::println);
    }
}