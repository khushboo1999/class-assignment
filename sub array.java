import java.util.*;
class work
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        int array[]=new int [size];
         System.out.println("enter the element of array");
         for(int i=0;i<size;i++)
         {
             array[i]=sc.nextInt();
             int count=0;
             size=size-k+1;
             count=(size*(size+1))/2;
              System.out.println("output");
              System.out.print(count);
         }
}
    