import java.util.Scanner;
public class Arrreverse {
    public static void main(String[] args)
    {
        // 1) Reverse Order elements in Array through declare Value
        // int arr[]={10,20,30,40};
        // System.out.println("Array's Elements are -:");

        // for(int i=arr.length-1;i>=0;i--)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        // 2) User Through take value then print Reverse value in Array
        // -:
        int arr[]=new int[4];
        Scanner s=new Scanner(System.in);

        System.out.print("Enter Array's Elements -:   ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s.nextInt();
        }
        System.out.print("Array Elements are -:       ");
 
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nArray Elements in Reverse -:");
        
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }



    }
    
}
