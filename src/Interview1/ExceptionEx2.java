package Interview1;
class ExceptionEx2
{
   public static void main(String args[])
   {
    try
    {
     int[] a=new int[5];
     a[5]=345/0;
    }
    catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
    {
     System.out.println("work 1 done");
    }
    catch(Exception e)
    {
      System.out.println("Common task completed");
    }
    System.out.println("remaining part of the code");
  }
}