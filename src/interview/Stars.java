package interview;
public class Stars 
{ 
    public static void main(String[] args) 
    { 
        int i, j;
        // outer loop to handle number of rows 
        //  n in this case 
         for(i=1; i<=5; i++) 
        { 
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop
            for(j=1; j<=i; j++) 
            { // printing stars 
                System.out.print("* "); 
            } // ending line after each row 
            System.out.println(); 
        } 
   } 
}