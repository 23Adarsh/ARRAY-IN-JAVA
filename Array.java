import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        // ** firstly we print static type **
       // 1) Type -:
       // int a[]={10,20,3,4};
       // System.out.print(a[3]);

       // Type -:2  
        int a[] = new int [4];
         a[0] = 10;
         a[1] = 20;
         a[2] = 30;
      
        for(int i=0;i<3;i++)
       {
           System.out.print(a[i]+" ");
       }

      //  Second Type is Take Value From User ...

      int size;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter Array Size -:\n");
      size = s.nextInt();
      
      System.out.print("Enter Elements -:\n");
      int a[] = new int [size];

      for(int i=0;i<size;i++)
      {
         a[i] = s.nextInt();
      }
       System.out.print("Elements are in array -:\n");
      for(int i=0;i<size;i++)
      {
         System.out.print(a[i]+" ");
      }

    }
}
