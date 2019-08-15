package Practice;
import java.util.ArrayList;
import java.util.List;

import com.google.zxing.common.detector.MathUtils;
class Addition { 
    public static void main(String[] args) 
    { 
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(5); 
        list.add(6); 
        list.add(7); 
        list.add(8); 
        list.add(9); 
        list.add(10); 
        int l=list.stream().mapToInt(i->i).sum(); 
        System.out.println(l);
        int sum = list.stream().reduce(0, (x,y) -> x+y);
        System.out.println(sum);
        int sum1 = list.stream().reduce(0, Integer::sum);
        System.out.println(sum1);
        int temp = 0;
        for (int x : list) {
           temp =temp+x;
        }
        System.out.println(temp);
    } 
} 