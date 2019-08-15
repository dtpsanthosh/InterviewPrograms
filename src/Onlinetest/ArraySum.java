package Onlinetest;
class ArraySum
{
    public static void main(String[] args)
    {
         int arr[]= {5,8,3,6,7,9,2};
         int sum=0;
         System.out.print("Sum of Array Elements is : ");
         for(int i=0;i<arr.length;i++)
         {
             sum=sum+arr[i];
         }
         System.out.print(sum);
    }
}