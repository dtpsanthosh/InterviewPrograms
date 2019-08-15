package Interview1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {   
    public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println(l);  
        Set<String> s=new LinkedHashSet<>(l);
        System.out.println(s);
    }  
}  