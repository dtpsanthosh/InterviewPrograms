package StreamAPI;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
 
public class StreamFlatMapEx {
 
    public static void main(String a[]) {
 
        try {
            long noOfWords = Files.lines(Paths.get("D:/jn.txt"))
                                    .flatMap(l->Arrays.stream(l.split(" +")))
                                    .distinct()
                                    .count();
            System.out.println("noOfWords: "+noOfWords);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}