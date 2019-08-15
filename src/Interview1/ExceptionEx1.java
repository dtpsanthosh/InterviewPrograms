package Interview1;
class ExceptionEx1
  {
    public static void main(String args[])
      {
        try
          {
            int a[]=new int[5];
            a[5]=345/0;
          }
        catch(ArithmeticException e)
          {
            System.out.println("work 1 done");
          }
        catch(ArrayIndexOutOfBoundsException e)
          {
            System.out.println("work 2 completed");
          }
        catch(Exception e)
          {
            System.out.println("Common task completed");
          }
        System.out.println("remaining part of the code");
      }
  }